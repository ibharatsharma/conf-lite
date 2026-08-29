package gg.jte.generated.ondemand.pages;
import com.bharat.conflite.page.Page;
import java.util.List;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.csrf.CsrfToken;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JtelistGenerated {
	public static final String JTE_NAME = "pages/list.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,5,5,10,10,14,14,50,50,50,50,50,50,50,50,50,72,72,92,92,96,96,107,107,107,107,108,108,108,113,113,113,121,121,121,121,132,132,136,136,138,138,139,139,5,6,7,8,8,8,8};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<Page> pages, String query, Authentication authentication, CsrfToken csrf) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, "Pages", authentication, csrf, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n<div class=\"d-flex justify-content-between align-items-center mb-4\">\r\n\r\n    <div>\r\n        <h1 class=\"h2 mb-1\">\r\n            Knowledge base\r\n        </h1>\r\n\r\n        <p class=\"text-muted mb-0\">\r\n            Markdown-powered team documentation.\r\n        </p>\r\n    </div>\r\n\r\n    <a\r\n        class=\"btn btn-primary\"\r\n        href=\"/pages/new\">\r\n        New page\r\n    </a>\r\n\r\n</div>\r\n\r\n<div class=\"card shadow-sm mb-4\">\r\n\r\n    <div class=\"card-body\">\r\n\r\n        <form\r\n            method=\"get\"\r\n            action=\"/\"\r\n            class=\"row g-2\">\r\n\r\n            <div class=\"col\">\r\n\r\n                <input\r\n                    type=\"search\"\r\n                    name=\"q\"\r\n                   ");
				var __jte_html_attribute_0 = query;
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\r\n                    class=\"form-control\"\r\n                    placeholder=\"Search pages...\">\r\n\r\n            </div>\r\n\r\n            <div class=\"col-auto\">\r\n\r\n                <button\r\n                    class=\"btn btn-outline-secondary\"\r\n                    type=\"submit\">\r\n                    Search\r\n                </button>\r\n\r\n            </div>\r\n\r\n        </form>\r\n\r\n    </div>\r\n\r\n</div>\r\n\r\n");
				if (pages.isEmpty()) {
					jteOutput.writeContent("    <div class=\"text-center py-5\">\r\n\r\n        <div class=\"display-6 mb-3\">\r\n            No pages yet\r\n        </div>\r\n\r\n        <p class=\"text-muted\">\r\n            Create your first documentation page.\r\n        </p>\r\n\r\n        <a\r\n            href=\"/pages/new\"\r\n            class=\"btn btn-primary\">\r\n            Create page\r\n        </a>\r\n\r\n    </div>\r\n\r\n");
				} else {
					jteOutput.writeContent("    <div class=\"row g-4\">\r\n\r\n");
					for (Page page : pages) {
						jteOutput.writeContent("            <div class=\"col-md-6 col-lg-4\">\r\n\r\n                <div class=\"card h-100 shadow-sm\">\r\n\r\n                    <div class=\"card-body\">\r\n\r\n                        <h2 class=\"h5\">\r\n                            <a\r\n                                class=\"text-decoration-none\"\r\n                                href=\"/pages/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(page.getSlug());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">\r\n                                ");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(page.getTitle());
						jteOutput.writeContent("\r\n                            </a>\r\n                        </h2>\r\n\r\n                        <p class=\"small text-muted mb-0\">\r\n                            /");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(page.getSlug());
						jteOutput.writeContent("\r\n                        </p>\r\n\r\n                    </div>\r\n\r\n                    <div class=\"card-footer bg-white\">\r\n\r\n                        <a\r\n                            href=\"/pages/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(page.getSlug());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\"\r\n                            class=\"btn btn-sm btn-outline-primary\">\r\n                            Open\r\n                        </a>\r\n\r\n                    </div>\r\n\r\n                </div>\r\n\r\n            </div>\r\n\r\n");
					}
					jteOutput.writeContent("    </div>\r\n\r\n");
				}
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<Page> pages = (List<Page>)params.get("pages");
		String query = (String)params.get("query");
		Authentication authentication = (Authentication)params.getOrDefault("authentication",  null);
		CsrfToken csrf = (CsrfToken)params.getOrDefault("csrf",  null);
		render(jteOutput, jteHtmlInterceptor, pages, query, authentication, csrf);
	}
}
