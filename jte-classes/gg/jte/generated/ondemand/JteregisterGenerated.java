package gg.jte.generated.ondemand;
import org.springframework.security.web.csrf.CsrfToken;
import com.bharat.conflite.user.RegistrationForm;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JteregisterGenerated {
	public static final String JTE_NAME = "register.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,3,3,7,7,11,11,25,25,27,27,27,29,29,37,37,37,37,37,37,37,37,37,38,38,38,38,38,38,38,38,38,52,52,52,52,52,52,52,52,52,76,76,76,76,76,76,76,76,76,148,148,148,149,149,3,4,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CsrfToken csrf, RegistrationForm form, String error) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, "Register", null, csrf, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n<div class=\"row justify-content-center\">\r\n\r\n    <div class=\"col-md-7 col-lg-5\">\r\n\r\n        <div class=\"card shadow-sm\">\r\n\r\n            <div class=\"card-body p-4\">\r\n\r\n                <h1 class=\"h3 mb-4\">\r\n                    Create account\r\n                </h1>\r\n\r\n");
				if (error != null) {
					jteOutput.writeContent("                <div class=\"alert alert-danger\">\r\n                    ");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(error);
					jteOutput.writeContent("\r\n                </div>\r\n");
				}
				jteOutput.writeContent("                <form\r\n                    action=\"/register\"\r\n                    method=\"post\">\r\n\r\n                    <input\r\n                        type=\"hidden\"\r\n                       ");
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
				jteOutput.writeContent(">\r\n\r\n                    <div class=\"mb-3\">\r\n\r\n                        <label\r\n                            class=\"form-label\"\r\n                            for=\"username\">\r\n                            Username\r\n                        </label>\r\n\r\n                        <input\r\n                            class=\"form-control\"\r\n                            id=\"username\"\r\n                            name=\"username\"\r\n                           ");
				var __jte_html_attribute_2 = form.getUsername();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\r\n                            autocomplete=\"username\"\r\n                            minlength=\"3\"\r\n                            required>\r\n\r\n                        <div class=\"form-text\">\r\n                            Lowercase letters, numbers, dots,\r\n                            underscores and hyphens.\r\n                        </div>\r\n\r\n                    </div>\r\n\r\n                    <div class=\"mb-3\">\r\n\r\n                        <label\r\n                            class=\"form-label\"\r\n                            for=\"displayName\">\r\n                            Display name\r\n                        </label>\r\n\r\n                        <input\r\n                            class=\"form-control\"\r\n                            id=\"displayName\"\r\n                            name=\"displayName\"\r\n                           ");
				var __jte_html_attribute_3 = form.getDisplayName();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\r\n                            autocomplete=\"name\"\r\n                            required>\r\n\r\n                    </div>\r\n\r\n                    <div class=\"mb-3\">\r\n\r\n                        <label\r\n                            class=\"form-label\"\r\n                            for=\"password\">\r\n                            Password\r\n                        </label>\r\n\r\n                        <input\r\n                            class=\"form-control\"\r\n                            id=\"password\"\r\n                            name=\"password\"\r\n                            type=\"password\"\r\n                            minlength=\"8\"\r\n                            autocomplete=\"new-password\"\r\n                            required>\r\n\r\n                    </div>\r\n\r\n                    <div class=\"mb-4\">\r\n\r\n                        <label\r\n                            class=\"form-label\"\r\n                            for=\"confirmPassword\">\r\n                            Confirm password\r\n                        </label>\r\n\r\n                        <input\r\n                            class=\"form-control\"\r\n                            id=\"confirmPassword\"\r\n                            name=\"confirmPassword\"\r\n                            type=\"password\"\r\n                            minlength=\"8\"\r\n                            autocomplete=\"new-password\"\r\n                            required>\r\n\r\n                    </div>\r\n\r\n                    <button\r\n                        class=\"btn btn-primary w-100\"\r\n                        type=\"submit\">\r\n                        Create account\r\n                    </button>\r\n\r\n                </form>\r\n\r\n                <div class=\"text-center mt-4\">\r\n\r\n                    <span class=\"text-muted\">\r\n                        Already have an account?\r\n                    </span>\r\n\r\n                    <a href=\"/login\">\r\n                        Sign in\r\n                    </a>\r\n\r\n                </div>\r\n\r\n            </div>\r\n\r\n        </div>\r\n\r\n    </div>\r\n\r\n</div>\r\n\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CsrfToken csrf = (CsrfToken)params.get("csrf");
		RegistrationForm form = (RegistrationForm)params.get("form");
		String error = (String)params.getOrDefault("error",  null);
		render(jteOutput, jteHtmlInterceptor, csrf, form, error);
	}
}
