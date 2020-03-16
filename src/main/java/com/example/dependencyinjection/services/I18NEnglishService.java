package com.example.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Profile("EN")
@Controller("i18NService")
public class I18NEnglishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - English";
    }
}
