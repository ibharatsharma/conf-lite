package com.bharat.conflite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;


@SpringBootApplication
@EnableJdbcRepositories(basePackages = {"com.bharat.conflite.page", "com.bharat.conflite.user"})
public class ConflLiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConflLiteApplication.class, args);
    }
}
