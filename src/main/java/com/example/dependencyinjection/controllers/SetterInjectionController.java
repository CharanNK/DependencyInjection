package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {


    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
