package gg.jte.generated.ondemand.common;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.csrf.CsrfToken;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JteheaderGenerated {
	public static final String JTE_NAME = "common/header.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,3,3,25,25,25,46,46,46,49,49,57,57,57,57,57,57,57,57,57,58,58,58,58,58,58,58,58,58,66,66,70,70,76,76,76,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Authentication authentication, CsrfToken csrf) {
		jteOutput.writeContent("\r\n<nav class=\"navbar navbar-expand-lg bg-dark navbar-dark\">\r\n    <div class=\"container\">\r\n\r\n        <a class=\"navbar-brand fw-semibold\" href=\"/\">\r\n            Conf Lite\r\n        </a>\r\n\r\n        <button\r\n            class=\"navbar-toggler\"\r\n            type=\"button\"\r\n            data-bs-toggle=\"collapse\"\r\n            data-bs-target=\"#mainNav\">\r\n            <span class=\"navbar-toggler-icon\"></span>\r\n        </button>\r\n\r\n        <div\r\n            class=\"collapse navbar-collapse\"\r\n            id=\"mainNav\">\r\n\r\n");
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
		jteOutput.writeContent("        </div>\r\n\r\n    </div>\r\n</nav>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Authentication authentication = (Authentication)params.getOrDefault("authentication",  null);
		CsrfToken csrf = (CsrfToken)params.getOrDefault("csrf",  null);
		render(jteOutput, jteHtmlInterceptor, authentication, csrf);
	}
}
