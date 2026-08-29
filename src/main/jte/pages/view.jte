@import com.bharat.conflite.page.Page
@import org.springframework.security.core.Authentication
@import org.springframework.security.web.csrf.CsrfToken

@param Page page
@param boolean editable
@param Authentication authentication = null
@param CsrfToken csrf = null

@template.layout(
    title = page.getTitle(),
    authentication = authentication,
    csrf = csrf,
    content = @`

<div class="row">

    <div class="col-lg-9">

        <div class="d-flex justify-content-between
                    align-items-start mb-4">

            <div>

                <h1 class="display-6 mb-1">
                    ${page.getTitle()}
                </h1>

                <div class="text-muted small">
                    /${page.getSlug()}
                </div>

            </div>

            @if(editable)

                <div class="d-flex gap-2">

                    <a
                        href="/pages/${page.getId()}/edit"
                        class="btn btn-outline-secondary">
                        Edit
                    </a>

                </div>

            @endif

        </div>

        <article class="markdown-body">

            $unsafe{page.getRenderedHtml()}

        </article>

    </div>

</div>

`)
