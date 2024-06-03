package com.example.springdemo.springdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @Value("${brother.name}")
    private String brotherName;

    @Value("${sister.name}")
    private String sisterName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is you lucky day";
    }

    @GetMapping("/familyInfo")
    public String familyInfo() {
        return brotherName + " and " + sisterName;
    }

}
