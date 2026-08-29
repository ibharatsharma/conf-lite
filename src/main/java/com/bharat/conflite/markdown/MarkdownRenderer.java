package com.bharat.conflite.markdown;


import org.commonmark.Extension;
import org.commonmark.ext.autolink.AutolinkExtension;
import org.commonmark.ext.gfm.strikethrough.StrikethroughExtension;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MarkdownRenderer {

    private final Parser parser;
    private final HtmlRenderer renderer;

    public MarkdownRenderer() {

        List<Extension> extensions = List.of(
                TablesExtension.create(),
                StrikethroughExtension.create(),
                AutolinkExtension.create());

        this.parser = Parser.builder()
                .extensions(extensions)
                .build();

        this.renderer = HtmlRenderer.builder()
                .extensions(extensions)

                // Prevent Markdown from injecting arbitrary HTML.
                .escapeHtml(true)

                // Prevent javascript:, data:, etc. from becoming
                // dangerous links/images.
                .sanitizeUrls(true)

                .build();
    }

    public String render(String markdown) {

        if (markdown == null || markdown.isBlank()) {
            return "";
        }

        Node document = parser.parse(markdown);

        return renderer.render(document);
    }
}
