package com.bharat.conflite.page;

public class PageForm {

    private String title = "";

    private String slug = "";

    private String markdown = "";

    public PageForm() {
    }

    public PageForm(Page page) {
        this.title = page.getTitle();
        this.slug = page.getSlug();
        this.markdown = page.getMarkdown();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }
}
