@import com.bharat.conflite.page.Page
@import java.util.List
@import org.springframework.security.core.Authentication
@import org.springframework.security.web.csrf.CsrfToken

@param List<Page> pages
@param String query
@param Authentication authentication = null
@param CsrfToken csrf = null

@template.layout(
    title = "Pages",
    authentication = authentication,
    csrf = csrf,
    content = @`

<div class="d-flex justify-content-between align-items-center mb-4">

    <div>
        <h1 class="h2 mb-1">
            Knowledge base
        </h1>

        <p class="text-muted mb-0">
            Markdown-powered team documentation.
        </p>
    </div>

    <a
        class="btn btn-primary"
        href="/pages/new">
        New page
    </a>

</div>

<div class="card shadow-sm mb-4">

    <div class="card-body">

        <form
            method="get"
            action="/"
            class="row g-2">

            <div class="col">

                <input
                    type="search"
                    name="q"
                    value="${query}"
                    class="form-control"
                    placeholder="Search pages...">

            </div>

            <div class="col-auto">

                <button
                    class="btn btn-outline-secondary"
                    type="submit">
                    Search
                </button>

            </div>

        </form>

    </div>

</div>

@if(pages.isEmpty())

    <div class="text-center py-5">

        <div class="display-6 mb-3">
            No pages yet
        </div>

        <p class="text-muted">
            Create your first documentation page.
        </p>

        <a
            href="/pages/new"
            class="btn btn-primary">
            Create page
        </a>

    </div>

@else

    <div class="row g-4">

        @for(Page page : pages)

            <div class="col-md-6 col-lg-4">

                <div class="card h-100 shadow-sm">

                    <div class="card-body">

                        <h2 class="h5">
                            <a
                                class="text-decoration-none"
                                href="/pages/${page.getSlug()}">
                                ${page.getTitle()}
                            </a>
                        </h2>

                        <p class="small text-muted mb-0">
                            /${page.getSlug()}
                        </p>

                    </div>

                    <div class="card-footer bg-white">

                        <a
                            href="/pages/${page.getSlug()}"
                            class="btn btn-sm btn-outline-primary">
                            Open
                        </a>

                    </div>

                </div>

            </div>

        @endfor

    </div>

@endif

`)
