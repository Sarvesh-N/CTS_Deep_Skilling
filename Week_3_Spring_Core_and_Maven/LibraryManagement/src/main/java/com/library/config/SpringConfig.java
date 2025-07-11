package com.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.library.service.BookService;

@Configuration
public class SpringConfig {

    @Bean
    public BookService bookService() {
        return new BookService();
    }
}
