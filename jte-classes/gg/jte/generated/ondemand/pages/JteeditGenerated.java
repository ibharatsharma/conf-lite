package gg.jte.generated.ondemand.pages;
import com.bharat.conflite.page.PageForm;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.csrf.CsrfToken;
@SuppressWarnings("unchecked")
@javax.annotation.processing.Generated("gg.jte.TemplateEngine")
public final class JteeditGenerated {
	public static final String JTE_NAME = "pages/edit.jte";
	public static final int[] JTE_LINE_INFO = {1,1,2,3,5,5,5,5,5,12,12,16,16,21,21,23,23,25,25,30,30,32,32,32,34,34,38,38,38,38,38,38,38,38,38,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,47,47,47,47,47,47,47,47,47,52,52,52,52,52,52,52,52,52,58,58,58,64,64,66,66,68,68,74,74,81,81,81,81,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,87,87,90,90,90,91,91,5,6,7,8,9,10,10,10,10};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, PageForm form, String pageId, String mode, String error, Authentication authentication, CsrfToken csrf) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, mode.equals("create") ? "New page" : "Edit page", authentication, csrf, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n<div class=\"row justify-content-center\">\r\n    <div class=\"col-12 col-xl-10\">\r\n        <div class=\"d-flex justify-content-between align-items-center mb-4\">\r\n            <div>\r\n");
				if (mode.equals("create")) {
					jteOutput.writeContent("                <h1 class=\"h2\">Create page</h1>\r\n");
				} else {
					jteOutput.writeContent("                <h1 class=\"h2\">Edit page</h1>\r\n");
				}
				jteOutput.writeContent("            </div>\r\n            <a href=\"/\" class=\"btn btn-outline-secondary\">Cancel</a>\r\n        </div>\r\n\r\n");
				if (error != null) {
					jteOutput.writeContent("        <div class=\"alert alert-danger\">\r\n            ");
					jteOutput.setContext("div", null);
					jteOutput.writeUserContent(error);
					jteOutput.writeContent("\r\n        </div>\r\n");
				}
				jteOutput.writeContent("        @* Use one single form tag with a dynamic action attribute *@\r\n        <form \r\n           ");
				var __jte_html_attribute_0 = mode.equals("create") ? "/pages" : "/pages/" + pageId;
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" \r\n            method=\"post\">\r\n            \r\n            <input type=\"hidden\"");
				var __jte_html_attribute_1 = csrf.getParameterName();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" name=\"");
					jteOutput.setContext("input", "name");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				var __jte_html_attribute_2 = csrf.getToken();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">\r\n\r\n            <div class=\"card shadow-sm\">\r\n                <div class=\"card-body\">\r\n                    <div class=\"mb-3\">\r\n                        <label class=\"form-label\" for=\"title\">Title</label>\r\n                        <input id=\"title\" name=\"title\" class=\"form-control form-control-lg\"");
				var __jte_html_attribute_3 = form.getTitle();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required>\r\n                    </div>\r\n\r\n                    <div class=\"mb-4\">\r\n                        <label class=\"form-label\" for=\"slug\">Slug</label>\r\n                        <input id=\"slug\" name=\"slug\" class=\"form-control\"");
				var __jte_html_attribute_4 = form.getSlug();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_4);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" placeholder=\"my-documentation-page\">\r\n                        <div class=\"form-text\">Leave empty to generate the slug from the title.</div>\r\n                    </div>\r\n\r\n                    <div class=\"mb-3\">\r\n                        <label class=\"form-label\" for=\"markdown\">Markdown</label>\r\n                        <textarea id=\"markdown\" name=\"markdown\" class=\"form-control font-monospace markdown-editor\" rows=\"24\" spellcheck=\"false\">");
				jteOutput.setContext("textarea", null);
				jteOutput.writeUserContent(form.getMarkdown());
				jteOutput.writeContent("</textarea>\r\n                    </div>\r\n                </div>\r\n\r\n                <div class=\"card-footer bg-white\">\r\n                    <button type=\"submit\" class=\"btn btn-primary\">\r\n");
				if (mode.equals("create")) {
					jteOutput.writeContent("                        Create page\r\n");
				} else {
					jteOutput.writeContent("                        Save changes\r\n");
				}
				jteOutput.writeContent("                    </button>\r\n                </div>\r\n            </div>\r\n        </form>\r\n\r\n");
				if (mode.equals("edit")) {
					jteOutput.writeContent("        <div class=\"card border-danger mt-4\">\r\n            <div class=\"card-body\">\r\n                <h2 class=\"h5 text-danger\">Delete page</h2>\r\n                <p class=\"text-muted\">This permanently removes the page.</p>\r\n                \r\n                @* Independent delete form *@\r\n                <form method=\"post\" action=\"/pages/");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(pageId);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("/delete\">\r\n                    <input type=\"hidden\"");
					var __jte_html_attribute_5 = csrf.getParameterName();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
						jteOutput.writeContent(" name=\"");
						jteOutput.setContext("input", "name");
						jteOutput.writeUserContent(__jte_html_attribute_5);
						jteOutput.setContext("input", null);
						jteOutput.writeContent("\"");
					}
					var __jte_html_attribute_6 = csrf.getToken();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_6)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("input", "value");
						jteOutput.writeUserContent(__jte_html_attribute_6);
						jteOutput.setContext("input", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">\r\n                    <button class=\"btn btn-outline-danger\" type=\"submit\">Delete page</button>\r\n                </form>\r\n            </div>\r\n        </div>\r\n");
				}
				jteOutput.writeContent("    </div>\r\n</div>\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		PageForm form = (PageForm)params.get("form");
		String pageId = (String)params.getOrDefault("pageId",  null);
		String mode = (String)params.get("mode");
		String error = (String)params.getOrDefault("error",  null);
		Authentication authentication = (Authentication)params.getOrDefault("authentication",  null);
		CsrfToken csrf = (CsrfToken)params.getOrDefault("csrf",  null);
		render(jteOutput, jteHtmlInterceptor, form, pageId, mode, error, authentication, csrf);
	}
}
