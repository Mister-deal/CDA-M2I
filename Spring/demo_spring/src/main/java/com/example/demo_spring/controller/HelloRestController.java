package com.example.demo_spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/home")
public class HelloRestController {

    //ne pas mettre value met l'élément affiché à la racine du requestMapping
    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String sayHello(){
        System.out.println("hello");
        return "hello world!!!!";
    }
    @GetMapping(value = "persons")
    public List<String> sayHelloJson(){
        return List.of("john dupont", "didier", "toto", "tate mikazuchi");
    }
}
