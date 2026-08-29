package com.bharat.conflite.page;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("pages")
public class Page {

    @Id
    private String id;

    private String slug;

    private String title;

    private String markdown;

    @Column("rendered_html")
    private String renderedHtml;

    @Column("owner_id")
    private String ownerId;

    @Column("created_at")
    private long createdAt;

    @Column("updated_at")
    private long updatedAt;

    public Page() {
    }

    public Page(
            String id,
            String slug,
            String title,
            String markdown,
            String renderedHtml,
            String ownerId,
            long createdAt,
            long updatedAt) {
        this.id = id;
        this.slug = slug;
        this.title = title;
        this.markdown = markdown;
        this.renderedHtml = renderedHtml;
        this.ownerId = ownerId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public String getRenderedHtml() {
        return renderedHtml;
    }

    public void setRenderedHtml(String renderedHtml) {
        this.renderedHtml = renderedHtml;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
