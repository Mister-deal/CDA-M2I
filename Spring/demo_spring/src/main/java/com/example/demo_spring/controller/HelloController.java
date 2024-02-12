package com.example.demo_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String sayBonjour(){
        System.out.println("bonjour, bogdanov!");
        return "hello";
    }
    @RequestMapping(value = "/coucou")
    @ResponseBody
    public List<String> getPersons(){
        return List.of("John dupont", "tOTO", "rara");
    }
    @RequestMapping(value = "toto")
    public String showTOTO(){
        return "toto";
    }

    @RequestMapping("/home/person")
    public String personName(Model model){
        model.addAttribute("firstName", "john");
        model.addAttribute("lastName", "doe");

        List<String> persons = List.of("John dupont", "dudu chanterelle", "siegfried yabrav");

        model.addAttribute("persons", persons);

        return "person/details";
    }
}
