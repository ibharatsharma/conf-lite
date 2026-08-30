@import gg.jte.Content
@import org.springframework.security.core.Authentication
@import org.springframework.security.web.csrf.CsrfToken

@param String title
@param Authentication authentication = null
@param CsrfToken csrf = null
@param Content content

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1">

    <title>${title} - Confluence Lite</title>

    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
        rel="stylesheet">

    <link
        href="/css/app.css"
        rel="stylesheet">
</head>

<body class="bg-body-tertiary">
@template.common.header(authentication = authentication, csrf = csrf)
<main class="container py-4">
    ${content}
</main>

<footer class="border-top bg-white mt-5">
    <div class="container py-4 text-muted small">
        Conf Lite · Built by Bharat Sharma
    </div>
</footer>

<script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js">
</script>

</body>
</html>
