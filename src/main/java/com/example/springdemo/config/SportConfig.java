package com.example.springdemo.config;

import com.example.springdemo.springdemo.domain.Coach;
import com.example.springdemo.springdemo.domain.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //Bean id is defaults to the method name
    @Bean("aquaman")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
