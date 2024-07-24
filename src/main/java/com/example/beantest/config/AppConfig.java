package com.example.beantest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.beantest.util.Greet;
import com.example.beantest.util.Hello;
import com.example.beantest.util.Hi;

@Configuration
public class AppConfig {
    @Bean
    Greet hello() {
        return new Hello();
    }

    @Bean
    Greet hi() {
        return new Hi();
    }
}
