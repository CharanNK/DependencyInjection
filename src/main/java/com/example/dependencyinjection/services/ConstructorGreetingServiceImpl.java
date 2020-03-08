package com.example.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements ConstructorGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
