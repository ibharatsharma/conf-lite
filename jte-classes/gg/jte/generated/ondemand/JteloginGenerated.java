package gg.jte.generated.ondemand;
import org.springframework.security.web.csrf.CsrfToken;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JteloginGenerated {
	public static final String JTE_NAME = "login.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,2,2,7,7,11,11,25,25,32,32,34,40,40,42,48,48,56,56,56,56,56,56,56,56,56,57,57,57,57,57,57,57,57,57,123,123,123,124,124,2,3,4,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CsrfToken csrf, boolean loginError, boolean logout, boolean registered) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, "Login", null, csrf, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n<div class=\"row justify-content-center\">\r\n\r\n    <div class=\"col-md-6 col-lg-4\">\r\n\r\n        <div class=\"card shadow-sm\">\r\n\r\n            <div class=\"card-body p-4\">\r\n\r\n                <h1 class=\"h3 mb-4\">\r\n                    Sign in\r\n                </h1>\r\n\r\n");
				if (registered) {
					jteOutput.writeContent("                    <div class=\"alert alert-success\">\r\n                        Your account has been created.\r\n                        You can now sign in.\r\n                    </div>\r\n\r\n");
				}
				if (loginError) {
					jteOutput.writeContent("                    <div class=\"alert alert-danger\">\r\n                        Invalid username or password.\r\n                    </div>\r\n\r\n");
				}
				if (logout) {
					jteOutput.writeContent("                    <div class=\"alert alert-success\">\r\n                        You have been logged out.\r\n                    </div>\r\n\r\n");
				}
				jteOutput.writeContent("                <form\r\n                    action=\"/login\"\r\n                    method=\"post\">\r\n\r\n                    <input\r\n                        type=\"hidden\"\r\n                       ");
				var __jte_html_attribute_0 = csrf.getParameterName();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\r\n                       ");
				var __jte_html_attribute_1 = csrf.getToken();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n\r\n                    <div class=\"mb-3\">\r\n\r\n                        <label\r\n                            class=\"form-label\"\r\n                            for=\"username\">\r\n                            Username\r\n                        </label>\r\n\r\n                        <input\r\n                            class=\"form-control\"\r\n                            id=\"username\"\r\n                            name=\"username\"\r\n                            autocomplete=\"username\"\r\n                            required\r\n                            autofocus>\r\n\r\n                    </div>\r\n\r\n                    <div class=\"mb-3\">\r\n\r\n                        <label\r\n                            class=\"form-label\"\r\n                            for=\"password\">\r\n                            Password\r\n                        </label>\r\n\r\n                        <input\r\n                            class=\"form-control\"\r\n                            id=\"password\"\r\n                            name=\"password\"\r\n                            type=\"password\"\r\n                            autocomplete=\"current-password\"\r\n                            required>\r\n\r\n                    </div>\r\n\r\n                    <button\r\n                        class=\"btn btn-primary w-100\"\r\n                        type=\"submit\">\r\n                        Sign in\r\n                    </button>\r\n\r\n                </form>\r\n\r\n                <div class=\"text-center mt-4\">\r\n\r\n                    <span class=\"text-muted\">\r\n                        Don't have an account?\r\n                    </span>\r\n\r\n                    <a href=\"/register\">\r\n                        Register\r\n                    </a>\r\n\r\n                </div>\r\n\r\n            </div>\r\n\r\n        </div>\r\n\r\n    </div>\r\n\r\n</div>\r\n\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CsrfToken csrf = (CsrfToken)params.get("csrf");
		boolean loginError = (boolean)params.getOrDefault("loginError",  false);
		boolean logout = (boolean)params.getOrDefault("logout",  false);
		boolean registered = (boolean)params.getOrDefault("registered",  false);
		render(jteOutput, jteHtmlInterceptor, csrf, loginError, logout, registered);
	}
}
