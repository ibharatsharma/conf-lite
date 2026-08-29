@import org.springframework.security.web.csrf.CsrfToken
@import com.bharat.conflite.user.RegistrationForm

@param CsrfToken csrf
@param RegistrationForm form
@param String error = null

@template.layout(
    title = "Register",
    authentication = null,
    csrf = csrf,
    content = @`

<div class="row justify-content-center">

    <div class="col-md-7 col-lg-5">

        <div class="card shadow-sm">

            <div class="card-body p-4">

                <h1 class="h3 mb-4">
                    Create account
                </h1>

                @if(error != null)
                    <div class="alert alert-danger">
                        ${error}
                    </div>
                @endif

                <form
                    action="/register"
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
                            value="${form.getUsername()}"
                            autocomplete="username"
                            minlength="3"
                            required>

                        <div class="form-text">
                            Lowercase letters, numbers, dots,
                            underscores and hyphens.
                        </div>

                    </div>

                    <div class="mb-3">

                        <label
                            class="form-label"
                            for="displayName">
                            Display name
                        </label>

                        <input
                            class="form-control"
                            id="displayName"
                            name="displayName"
                            value="${form.getDisplayName()}"
                            autocomplete="name"
                            required>

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
                            minlength="8"
                            autocomplete="new-password"
                            required>

                    </div>

                    <div class="mb-4">

                        <label
                            class="form-label"
                            for="confirmPassword">
                            Confirm password
                        </label>

                        <input
                            class="form-control"
                            id="confirmPassword"
                            name="confirmPassword"
                            type="password"
                            minlength="8"
                            autocomplete="new-password"
                            required>

                    </div>

                    <button
                        class="btn btn-primary w-100"
                        type="submit">
                        Create account
                    </button>

                </form>

                <div class="text-center mt-4">

                    <span class="text-muted">
                        Already have an account?
                    </span>

                    <a href="/login">
                        Sign in
                    </a>

                </div>

            </div>

        </div>

    </div>

</div>

`)
