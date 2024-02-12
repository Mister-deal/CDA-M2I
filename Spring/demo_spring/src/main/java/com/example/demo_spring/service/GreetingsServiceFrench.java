package com.example.demo_spring.service;

import org.springframework.stereotype.Service;

@Service("salutation")
public class GreetingsServiceFrench implements GreetingsService{


    @Override
    public String sayHello() {
        return "salutation";
    }
}
