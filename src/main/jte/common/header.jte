@import org.springframework.security.core.Authentication
@import org.springframework.security.web.csrf.CsrfToken

@param Authentication authentication = null
@param CsrfToken csrf = null

<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
    <div class="container">

        <a class="navbar-brand fw-semibold" href="/">
            Conf Lite
        </a>

        <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#mainNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div
            class="collapse navbar-collapse"
            id="mainNav">

            @if(authentication != null && authentication.isAuthenticated())

                <ul class="navbar-nav me-auto">

                    <li class="nav-item">
                        <a class="nav-link" href="/">
                            Pages
                        </a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="/pages/new">
                            New page
                        </a>
                    </li>

                </ul>

                <div class="d-flex align-items-center gap-3">

                    <span class="text-white-50">
                        ${authentication.getName()}
                    </span>

                    @if(csrf != null)
                        <form
                            action="/logout"
                            method="post"
                            class="m-0">

                            <input
                                type="hidden"
                                name="${csrf.getParameterName()}"
                                value="${csrf.getToken()}">

                            <button
                                class="btn btn-outline-light btn-sm"
                                type="submit">
                                Logout
                            </button>
                        </form>
                    @endif

                </div>

            @endif

        </div>

    </div>
</nav>
