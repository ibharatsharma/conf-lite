package com.bharat.conflite.page;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {

    private final PageService pageService;

    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @GetMapping("/")
    public String home(
            @RequestParam(required = false) String q,
            Model model) {

        model.addAttribute(
                "pages",
                pageService.search(q));

        model.addAttribute(
                "query",
                q == null ? "" : q);

        return "pages/list";
    }

    @GetMapping("/pages/{slug}")
    public String viewPage(
            @PathVariable String slug,
            Authentication authentication,
            Model model) {

        Page page = pageService.findBySlug(slug);

        model.addAttribute("page", page);

        model.addAttribute(
                "editable",
                pageService.isOwner(
                        page,
                        authentication.getName()));

        return "pages/view";
    }

    @GetMapping("/pages/new")
    public String newPage(Model model) {

        model.addAttribute(
                "form",
                new PageForm());

        model.addAttribute(
                "pageId",
                null);

        model.addAttribute(
                "mode",
                "create");

        return "pages/edit";
    }

    @PostMapping("/pages")
    public String createPage(
            @ModelAttribute PageForm form,
            Authentication authentication,
            Model model) {

        try {

            Page page = pageService.create(
                    form,
                    authentication.getName());

            return "redirect:/pages/" + page.getSlug();

        } catch (IllegalArgumentException ex) {

            model.addAttribute("form", form);
            model.addAttribute("pageId", null);
            model.addAttribute("mode", "create");
            model.addAttribute("error", ex.getMessage());

            return "pages/edit";
        }
    }

    @GetMapping("/pages/{id}/edit")
    public String editPage(
            @PathVariable String id,
            Authentication authentication,
            Model model) {

        Page page = pageService.findById(id);

        if (!pageService.isOwner(
                page,
                authentication.getName())) {

            throw new SecurityException(
                    "You are not allowed to edit this page.");
        }

        model.addAttribute(
                "form",
                new PageForm(page));

        model.addAttribute(
                "pageId",
                page.getId());

        model.addAttribute(
                "mode",
                "edit");

        return "pages/edit";
    }

    @PostMapping("/pages/{id}")
    public String updatePage(
            @PathVariable String id,
            @ModelAttribute PageForm form,
            Authentication authentication,
            Model model) {

        try {

            Page page = pageService.update(
                    id,
                    form,
                    authentication.getName());

            return "redirect:/pages/" + page.getSlug();

        } catch (IllegalArgumentException | SecurityException ex) {

            model.addAttribute("form", form);
            model.addAttribute("pageId", id);
            model.addAttribute("mode", "edit");
            model.addAttribute("error", ex.getMessage());

            return "pages/edit";
        }
    }

    @PostMapping("/pages/{id}/delete")
    public String deletePage(
            @PathVariable String id,
            Authentication authentication) {

        pageService.delete(
                id,
                authentication.getName());

        return "redirect:/";
    }
}
