package gg.jte.generated.ondemand;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.csrf.CsrfToken;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JteerrorGenerated {
	public static final String JTE_NAME = "error.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,3,3,7,7,11,11,24,24,24,35,35,35,36,36,3,4,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Authentication authentication, CsrfToken csrf, String message) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, "Error", authentication, csrf, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n<div class=\"text-center py-5\">\r\n\r\n    <div class=\"display-1 fw-bold text-muted\">\r\n        500\r\n    </div>\r\n\r\n    <h1 class=\"h3 mb-3\">\r\n        Something went wrong\r\n    </h1>\r\n\r\n    <p class=\"text-muted mb-4\">\r\n        ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(message);
				jteOutput.writeContent("\r\n    </p>\r\n\r\n    <a\r\n        href=\"/\"\r\n        class=\"btn btn-primary\">\r\n        Back to pages\r\n    </a>\r\n\r\n</div>\r\n\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Authentication authentication = (Authentication)params.getOrDefault("authentication",  null);
		CsrfToken csrf = (CsrfToken)params.getOrDefault("csrf",  null);
		String message = (String)params.getOrDefault("message",  "Something went wrong.");
		render(jteOutput, jteHtmlInterceptor, authentication, csrf, message);
	}
}
