package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello world :)";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return " run hard 5k ";
    }

    @GetMapping("/workout2")
    public String getDailyWorkout2(){
        return " run hard 6k ";
    }
}
