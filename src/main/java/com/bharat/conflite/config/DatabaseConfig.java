package com.bharat.conflite.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.core.dialect.JdbcDialect;
import org.springframework.data.jdbc.core.dialect.JdbcH2Dialect;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories
public class DatabaseConfig {

    @Bean
    JdbcDialect sqliteDialect() {
        return new SqliteDialect();
    }

    static final class SqliteDialect extends JdbcH2Dialect {

        @Override
        public String getName() {
            return "SQLite";
        }
    }
}
