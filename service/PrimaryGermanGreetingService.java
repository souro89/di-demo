package com.datakettle.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimaryGermanGreetingService  implements GreetingService {

    private GreetingService greetingService;



    @Override
    public String sayGreeting() {
        return "Mein Wee !!!";
    }

}
