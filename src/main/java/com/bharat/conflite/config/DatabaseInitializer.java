package com.bharat.conflite.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.io.File;

@Configuration
public class DatabaseInitializer {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseInitializer.class);

    @Bean
    public BeanPostProcessor databaseFolderPostProcessor() {
        return new BeanPostProcessor() {
            @Override
            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
                // This checks if the DataSource bean is being initialized
                if (bean.getClass().getName().contains("DataSource")) {
                    File dataDir = new File("data");
                    if (!dataDir.exists()) {
                        if (dataDir.mkdirs()) {
                            logger.info("Successfully created data directory at: {}", dataDir.getAbsolutePath());
                        } else {
                            logger.error("Failed to create data directory!");
                        }
                    }
                }
                return bean;
            }
        };
    }
}
