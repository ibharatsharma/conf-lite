package gg.jte.generated.ondemand.pages;
import com.bharat.conflite.page.Page;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.csrf.CsrfToken;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JteviewGenerated {
	public static final String JTE_NAME = "pages/view.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,4,9,9,13,13,25,25,25,29,29,29,34,34,39,39,39,39,46,46,52,52,60,60,60,61,61,4,5,6,7,7,7,7};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Page page, boolean editable, Authentication authentication, CsrfToken csrf) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, page.getTitle(), authentication, csrf, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n<div class=\"row\">\r\n\r\n    <div class=\"col-lg-9\">\r\n\r\n        <div class=\"d-flex justify-content-between\r\n                    align-items-start mb-4\">\r\n\r\n            <div>\r\n\r\n                <h1 class=\"display-6 mb-1\">\r\n                    ");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(page.getTitle());
				jteOutput.writeContent("\r\n                </h1>\r\n\r\n                <div class=\"text-muted small\">\r\n                    /");
				jteOutput.setContext("div", null);
				jteOutput.writeUserContent(page.getSlug());
				jteOutput.writeContent("\r\n                </div>\r\n\r\n            </div>\r\n\r\n");
				if (editable) {
					jteOutput.writeContent("                <div class=\"d-flex gap-2\">\r\n\r\n                    <a\r\n                        href=\"/pages/");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(page.getId());
					jteOutput.setContext("a", null);
					jteOutput.writeContent("/edit\"\r\n                        class=\"btn btn-outline-secondary\">\r\n                        Edit\r\n                    </a>\r\n\r\n                </div>\r\n\r\n");
				}
				jteOutput.writeContent("        </div>\r\n\r\n        <article class=\"markdown-body\">\r\n\r\n            ");
				jteOutput.writeUnsafeContent(page.getRenderedHtml());
				jteOutput.writeContent("\r\n\r\n        </article>\r\n\r\n    </div>\r\n\r\n</div>\r\n\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Page page = (Page)params.get("page");
		boolean editable = (boolean)params.get("editable");
		Authentication authentication = (Authentication)params.getOrDefault("authentication",  null);
		CsrfToken csrf = (CsrfToken)params.getOrDefault("csrf",  null);
		render(jteOutput, jteHtmlInterceptor, page, editable, authentication, csrf);
	}
}
