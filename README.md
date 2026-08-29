# Conf lite application
```
confluence-lite/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/confluencelite/
│       │       ├── ConfluenceLiteApplication.java
│       │       ├── config/
│       │       │   ├── DatabaseConfig.java
│       │       │   └── SecurityConfig.java
│       │       ├── markdown/
│       │       │   └── MarkdownRenderer.java
│       │       ├── page/
│       │       │   ├── Page.java
│       │       │   ├── PageController.java
│       │       │   ├── PageRepository.java
│       │       │   ├── PageService.java
│       │       │   └── PageForm.java
│       │       └── user/
│       │           ├── RegistrationForm.java
│       │           ├── User.java
│       │           ├── UserController.java
│       │           ├── UserRepository.java
│       │           ├── UserService.java
│       │           └── DatabaseUserDetailsService.java
│       └── resources/
│           ├── application.properties
│           ├── schema.sql
│           └── static/
│               └── css/
│                   └── app.css
└── src/
    └── main/
        └── jte/
            ├── layout.jte
            ├── login.jte
            ├── register.jte
            ├── pages/
            │   ├── list.jte
            │   ├── view.jte
            │   └── edit.jte
            └── error.jte
```