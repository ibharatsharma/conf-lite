@import org.springframework.security.core.Authentication
@import org.springframework.security.web.csrf.CsrfToken

@param Authentication authentication = null
@param CsrfToken csrf = null
@param String message = "Something went wrong."

@template.layout(
    title = "Error",
    authentication = authentication,
    csrf = csrf,
    content = @`

<div class="text-center py-5">

    <div class="display-1 fw-bold text-muted">
        500
    </div>

    <h1 class="h3 mb-3">
        Something went wrong
    </h1>

    <p class="text-muted mb-4">
        ${message}
    </p>

    <a
        href="/"
        class="btn btn-primary">
        Back to pages
    </a>

</div>

`)
