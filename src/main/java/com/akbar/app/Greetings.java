package com.akbar.app;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Greetings {

    @Bean
    public String getGreetings() {
        return "Hello World!";
    }

}
