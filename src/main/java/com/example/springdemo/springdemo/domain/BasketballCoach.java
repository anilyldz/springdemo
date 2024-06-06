package com.example.springdemo.springdemo.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BasketballCoach implements Coach{

    public BasketballCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Do 10 jumping jacks";
    }
}
