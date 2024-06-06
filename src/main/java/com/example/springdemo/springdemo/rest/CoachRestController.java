package com.example.springdemo.springdemo.rest;

import com.example.springdemo.springdemo.domain.Coach;
import com.example.springdemo.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachRestController {

    private Coach myCoach;

    private Coach anotherCoach;

    private Coach mySwimCoach;

    private Util myUtil;

    //Creating a constructor for injections
    //Primary example
    /*@Autowired
    public CoachRestController(Coach theCoach, Util util){
        myCoach = theCoach;
        myUtil = util;
    }*/

    //Qualifier example
    @Autowired
    public CoachRestController(@Qualifier("basketballCoach") Coach theCoach,
                               @Qualifier("basketballCoach") Coach theAnotherCoach,
                               @Qualifier("aquaman") Coach theSwimCoach,
                               Util util) {
        System.out.println("In constructor " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
        mySwimCoach = theSwimCoach;
        myUtil = util;
    }

    //This method name can be anything thanks to Autowired :)
    /*@Autowired
    public void setCoach(Coach theCoach, Util util) {
        myCoach = theCoach;
        myUtil = util;
    }*/

    @GetMapping("/dailyWorkout")
    public String getWorkout() {
        String utilResult = myUtil.utilMethod();
        return myCoach.getWorkout() + " " + utilResult;
    }

    @GetMapping("/checkBeans")
    public String checkBeans() {
        return "Comparing beans -> " + (myCoach == anotherCoach);
    }




}
