package gg.jte.generated.ondemand;
import gg.jte.Content;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.csrf.CsrfToken;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JtelayoutGenerated {
	public static final String JTE_NAME = "layout.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,4,16,16,16,16,48,48,69,69,69,72,72,80,80,80,80,80,80,80,80,80,81,81,81,81,81,81,81,81,81,89,89,93,93,102,102,102,118,118,118,4,5,6,7,7,7,7};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String title, Authentication authentication, CsrfToken csrf, Content content) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\"\r\n          content=\"width=device-width, initial-scale=1\">\r\n\r\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(title);
		jteOutput.writeContent(" - Confluence Lite</title>\r\n\r\n    <link\r\n        href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css\"\r\n        rel=\"stylesheet\">\r\n\r\n    <link\r\n        href=\"/css/app.css\"\r\n        rel=\"stylesheet\">\r\n</head>\r\n\r\n<body class=\"bg-body-tertiary\">\r\n\r\n<nav class=\"navbar navbar-expand-lg bg-dark navbar-dark\">\r\n    <div class=\"container\">\r\n\r\n        <a class=\"navbar-brand fw-semibold\" href=\"/\">\r\n            Confluence Lite\r\n        </a>\r\n\r\n        <button\r\n            class=\"navbar-toggler\"\r\n            type=\"button\"\r\n            data-bs-toggle=\"collapse\"\r\n            data-bs-target=\"#mainNav\">\r\n            <span class=\"navbar-toggler-icon\"></span>\r\n        </button>\r\n\r\n        <div\r\n            class=\"collapse navbar-collapse\"\r\n            id=\"mainNav\">\r\n\r\n");
		if (authentication != null && authentication.isAuthenticated()) {
			jteOutput.writeContent("                <ul class=\"navbar-nav me-auto\">\r\n\r\n                    <li class=\"nav-item\">\r\n                        <a class=\"nav-link\" href=\"/\">\r\n                            Pages\r\n                        </a>\r\n                    </li>\r\n\r\n                    <li class=\"nav-item\">\r\n                        <a class=\"nav-link\" href=\"/pages/new\">\r\n                            New page\r\n                        </a>\r\n                    </li>\r\n\r\n                </ul>\r\n\r\n                <div class=\"d-flex align-items-center gap-3\">\r\n\r\n                    <span class=\"text-white-50\">\r\n                        ");
			jteOutput.setContext("span", null);
			jteOutput.writeUserContent(authentication.getName());
			jteOutput.writeContent("\r\n                    </span>\r\n\r\n");
			if (csrf != null) {
				jteOutput.writeContent("                    <form\r\n                        action=\"/logout\"\r\n                        method=\"post\"\r\n                        class=\"m-0\">\r\n\r\n                        <input\r\n                            type=\"hidden\"\r\n                           ");
				var __jte_html_attribute_0 = csrf.getParameterName();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\r\n                           ");
				var __jte_html_attribute_1 = csrf.getToken();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n\r\n                        <button\r\n                            class=\"btn btn-outline-light btn-sm\"\r\n                            type=\"submit\">\r\n                            Logout\r\n                        </button>\r\n                    </form>\r\n");
			}
			jteOutput.writeContent("                </div>\r\n\r\n");
		}
		jteOutput.writeContent("        </div>\r\n\r\n    </div>\r\n</nav>\r\n\r\n<main class=\"container py-4\">\r\n\r\n    ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n\r\n</main>\r\n\r\n<footer class=\"border-top bg-white mt-5\">\r\n    <div class=\"container py-4 text-muted small\">\r\n        Confluence Lite · Spring Boot · Java · jte · SQLite\r\n    </div>\r\n</footer>\r\n\r\n<script\r\n    src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js\">\r\n</script>\r\n\r\n</body>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String title = (String)params.get("title");
		Authentication authentication = (Authentication)params.getOrDefault("authentication",  null);
		CsrfToken csrf = (CsrfToken)params.getOrDefault("csrf",  null);
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, title, authentication, csrf, content);
	}
}
