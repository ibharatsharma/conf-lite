package com.bharat.conflite.page;


import com.bharat.conflite.markdown.MarkdownRenderer;
import com.bharat.conflite.user.User;
import com.bharat.conflite.user.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.Normalizer;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

@Service
public class PageService {

    private final PageRepository pageRepository;
    private final UserService userService;
    private final MarkdownRenderer markdownRenderer;

    public PageService(
            PageRepository pageRepository,
            UserService userService,
            MarkdownRenderer markdownRenderer) {
        this.pageRepository = pageRepository;
        this.userService = userService;
        this.markdownRenderer = markdownRenderer;
    }

    public List<Page> findAll() {
        return pageRepository.findAllByOrderByUpdatedAtDesc();
    }

    public List<Page> search(String query) {

        if (query == null || query.isBlank()) {
            return findAll();
        }

        String escaped = "%" + query.trim() + "%";

        return pageRepository.search(escaped);
    }

    public Page findById(String id) {
        return pageRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Page not found."));
    }

    public Page findBySlug(String slug) {
        return pageRepository.findBySlug(slug)
                .orElseThrow(() -> new IllegalArgumentException("Page not found."));
    }

    @Transactional
    public Page create(PageForm form, String username) {

        String title = cleanTitle(form.getTitle());
        String slug = cleanSlug(form.getSlug(), title);

        if (title.isBlank()) {
            throw new IllegalArgumentException(
                    "Title is required.");
        }

        if (pageRepository.existsBySlug(slug)) {
            throw new IllegalArgumentException(
                    "A page with that slug already exists.");
        }

        User owner = userService.findByUsername(username);

        String markdown = form.getMarkdown() == null
                ? ""
                : form.getMarkdown();

        long now = System.currentTimeMillis();

        Page page = new Page(
                UUID.randomUUID().toString(),
                slug,
                title,
                markdown,
                markdownRenderer.render(markdown),
                owner.getId(),
                now,
                now);

        return pageRepository.save(page);
    }

    @Transactional
    public Page update(
            String id,
            PageForm form,
            String username) {

        Page existing = pageRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Page not found."));

        User user = userService.findByUsername(username);

        if (!existing.getOwnerId().equals(user.getId())) {
            throw new SecurityException(
                    "You are not allowed to edit this page.");
        }

        String title = cleanTitle(form.getTitle());
        String slug = cleanSlug(form.getSlug(), title);

        if (title.isBlank()) {
            throw new IllegalArgumentException(
                    "Title is required.");
        }

        pageRepository.findBySlug(slug)
                .filter(page -> !page.getId().equals(existing.getId()))
                .ifPresent(page -> {
                    throw new IllegalArgumentException(
                            "A page with that slug already exists.");
                });

        String markdown = form.getMarkdown() == null
                ? ""
                : form.getMarkdown();

        existing.setTitle(title);
        existing.setSlug(slug);
        existing.setMarkdown(markdown);
        existing.setRenderedHtml(markdownRenderer.render(markdown));
        existing.setUpdatedAt(System.currentTimeMillis());

        return pageRepository.save(existing);
    }

    @Transactional
    public void delete(String id, String username) {

        Page page = pageRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Page not found."));

        User user = userService.findByUsername(username);

        if (!page.getOwnerId().equals(user.getId())) {
            throw new SecurityException(
                    "You are not allowed to delete this page.");
        }

        pageRepository.deleteById(id);
    }

    public boolean isOwner(Page page, String username) {

        User user = userService.findByUsername(username);

        return page.getOwnerId().equals(user.getId());
    }

    private String cleanTitle(String title) {
        return title == null
                ? ""
                : title.trim();
    }

    private String cleanSlug(String slug, String title) {

        String value = slug == null || slug.isBlank()
                ? title
                : slug;

        value = Normalizer
                .normalize(value, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");

        value = value
                .toLowerCase(Locale.ROOT)
                .trim()
                .replaceAll("[^a-z0-9]+", "-")
                .replaceAll("^-+", "")
                .replaceAll("-+$", "");

        if (value.isBlank()) {
            throw new IllegalArgumentException(
                    "Unable to create a valid slug.");
        }

        return value;
    }

}
