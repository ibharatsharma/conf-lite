@import org.springframework.security.web.csrf.CsrfToken

@param CsrfToken csrf
@param boolean loginError = false
@param boolean logout = false
@param boolean registered = false

@template.layout(
    title = "Login",
    authentication = null,
    csrf = csrf,
    content = @`

<div class="row justify-content-center">

    <div class="col-md-6 col-lg-4">

        <div class="card shadow-sm">

            <div class="card-body p-4">

                <h1 class="h3 mb-4">
                    Sign in
                </h1>

                @if(registered)

                    <div class="alert alert-success">
                        Your account has been created.
                        You can now sign in.
                    </div>

                @endif

                @if(loginError)

                    <div class="alert alert-danger">
                        Invalid username or password.
                    </div>

                @endif

                @if(logout)

                    <div class="alert alert-success">
                        You have been logged out.
                    </div>

                @endif

                <form
                    action="/login"
                    method="post">

                    <input
                        type="hidden"
                        name="${csrf.getParameterName()}"
                        value="${csrf.getToken()}">

                    <div class="mb-3">

                        <label
                            class="form-label"
                            for="username">
                            Username
                        </label>

                        <input
                            class="form-control"
                            id="username"
                            name="username"
                            autocomplete="username"
                            required
                            autofocus>

                    </div>

                    <div class="mb-3">

                        <label
                            class="form-label"
                            for="password">
                            Password
                        </label>

                        <input
                            class="form-control"
                            id="password"
                            name="password"
                            type="password"
                            autocomplete="current-password"
                            required>

                    </div>

                    <button
                        class="btn btn-primary w-100"
                        type="submit">
                        Sign in
                    </button>

                </form>

                <div class="text-center mt-4">

                    <span class="text-muted">
                        Don't have an account?
                    </span>

                    <a href="/register">
                        Register
                    </a>

                </div>

            </div>

        </div>

    </div>

</div>

`)
