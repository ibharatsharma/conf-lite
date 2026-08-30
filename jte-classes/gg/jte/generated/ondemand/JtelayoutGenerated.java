package gg.jte.generated.ondemand;
import gg.jte.Content;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.csrf.CsrfToken;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JtelayoutGenerated {
	public static final String JTE_NAME = "layout.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,4,16,16,16,16,28,28,30,30,30,45,45,45,4,5,6,7,7,7,7};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String title, Authentication authentication, CsrfToken csrf, Content content) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\"\r\n          content=\"width=device-width, initial-scale=1\">\r\n\r\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(title);
		jteOutput.writeContent(" - Confluence Lite</title>\r\n\r\n    <link\r\n        href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css\"\r\n        rel=\"stylesheet\">\r\n\r\n    <link\r\n        href=\"/css/app.css\"\r\n        rel=\"stylesheet\">\r\n</head>\r\n\r\n<body class=\"bg-body-tertiary\">\r\n");
		gg.jte.generated.ondemand.common.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor, authentication, csrf);
		jteOutput.writeContent("\r\n<main class=\"container py-4\">\r\n    ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n</main>\r\n\r\n<footer class=\"border-top bg-white mt-5\">\r\n    <div class=\"container py-4 text-muted small\">\r\n        Conf Lite · Built by Bharat Sharma\r\n    </div>\r\n</footer>\r\n\r\n<script\r\n    src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js\">\r\n</script>\r\n\r\n</body>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String title = (String)params.get("title");
		Authentication authentication = (Authentication)params.getOrDefault("authentication",  null);
		CsrfToken csrf = (CsrfToken)params.getOrDefault("csrf",  null);
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, title, authentication, csrf, content);
	}
}
