
@import com.bharat.conflite.page.PageForm
@import org.springframework.security.core.Authentication
@import org.springframework.security.web.csrf.CsrfToken

@param PageForm form
@param String pageId = null
@param String mode
@param String error = null
@param Authentication authentication = null
@param CsrfToken csrf = null

@template.layout(
    title = mode.equals("create") ? "New page" : "Edit page",
    authentication = authentication,
    csrf = csrf,
    content = @`
<div class="row justify-content-center">
    <div class="col-12 col-xl-10">
        <div class="d-flex justify-content-between align-items-center mb-4">
            <div>
                @if(mode.equals("create"))
                    <h1 class="h2">Create page</h1>
                @else
                    <h1 class="h2">Edit page</h1>
                @endif
            </div>
            <a href="/" class="btn btn-outline-secondary">Cancel</a>
        </div>

        @if(error != null)
            <div class="alert alert-danger">
                ${error}
            </div>
        @endif

        @* Use one single form tag with a dynamic action attribute *@
        <form 
            action="${mode.equals("create") ? "/pages" : "/pages/" + pageId}" 
            method="post">
            
            <input type="hidden" name="${csrf.getParameterName()}" value="${csrf.getToken()}">

            <div class="card shadow-sm">
                <div class="card-body">
                    <div class="mb-3">
                        <label class="form-label" for="title">Title</label>
                        <input id="title" name="title" class="form-control form-control-lg" value="${form.getTitle()}" required>
                    </div>

                    <div class="mb-4">
                        <label class="form-label" for="slug">Slug</label>
                        <input id="slug" name="slug" class="form-control" value="${form.getSlug()}" placeholder="my-documentation-page">
                        <div class="form-text">Leave empty to generate the slug from the title.</div>
                    </div>

                    <div class="mb-3">
                        <label class="form-label" for="markdown">Markdown</label>
                        <textarea id="markdown" name="markdown" class="form-control font-monospace markdown-editor" rows="24" spellcheck="false">${form.getMarkdown()}</textarea>
                    </div>
                </div>

                <div class="card-footer bg-white">
                    <button type="submit" class="btn btn-primary">
                        @if(mode.equals("create"))
                            Create page
                        @else
                            Save changes
                        @endif
                    </button>
                </div>
            </div>
        </form>

        @if(mode.equals("edit"))
            <div class="card border-danger mt-4">
                <div class="card-body">
                    <h2 class="h5 text-danger">Delete page</h2>
                    <p class="text-muted">This permanently removes the page.</p>
                    
                    @* Independent delete form *@
                    <form method="post" action="/pages/${pageId}/delete">
                        <input type="hidden" name="${csrf.getParameterName()}" value="${csrf.getToken()}">
                        <button class="btn btn-outline-danger" type="submit">Delete page</button>
                    </form>
                </div>
            </div>
        @endif
    </div>
</div>
`)
