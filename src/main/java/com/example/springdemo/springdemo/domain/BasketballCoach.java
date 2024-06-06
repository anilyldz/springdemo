package com.example.springdemo.springdemo.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BasketballCoach implements Coach{

    @PostConstruct
    public void doStartupStuff(){
        System.out.println("Doing start up stuff");
    }

    public BasketballCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doPreDestroyStuff(){
        System.out.println("Doing pre destroy stuff");
    }

    @Override
    public String getWorkout() {
        return "Do 10 jumping jacks";
    }
}
