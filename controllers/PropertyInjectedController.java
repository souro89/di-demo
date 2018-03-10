package com.datakettle.didemo.controllers;

import com.datakettle.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    private GreetingService greetingServiceImpl;

    public String sayHello(){

        return greetingServiceImpl.sayGreeting();
    }



}
