package com.example.base_spring.controller;


import com.example.base_spring.model.Rabbit;
import com.example.base_spring.service.RabbitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class DemoController {

    private final RabbitService rabbitService;

    @GetMapping
    public String homePage(){
        return "pagea";
    }



    @GetMapping("/detail/{rabbitId}")
    public String detailRabbit(@PathVariable("rabbitId")UUID id, Model model){
        Rabbit rabbit = rabbitService.getRabbitById(id);
        model.addAttribute("monlapin",rabbit);
        return "pagec";
    }

    @GetMapping("/pageb")
    public String pageb(Model model){
        List<Rabbit> rabbits = rabbitService.getRabbits();
        Rabbit rabbit = rabbits.get(0);
        model.addAttribute("idLapin",rabbit.getId());
        return "pageb";
    }

    @GetMapping("/list")
    public String listingRabbits(Model model){
        List<Rabbit> rabbits = rabbitService.getRabbits();
        Rabbit rabbit = rabbits.get(0);
        model.addAttribute("idLapin",rabbit.getId());

        model.addAttribute("rabbits",rabbits);
        return "pageb";
    }

    @GetMapping("/add")
    public String addRabbit(Model model){
        model.addAttribute("rabbit",new Rabbit());

        return "form/form";
    }

    @PostMapping("/add")
    public String submitRabbit(@ModelAttribute("rabbit") Rabbit rabbit){
        System.out.println(rabbit.getName());
        System.out.println(rabbit.getBreed());
        rabbitService.addRabbit(rabbit);
        return "redirect:/";
    }

    @GetMapping("/addrabbit")
    public String submitRabbitVTwo(@RequestParam("name") String name,@RequestParam("breed") String breed){
        System.out.println(name);
        System.out.println(breed);
        rabbitService.addRabbit(new Rabbit(null,name,breed));
        return "redirect:/";
    }

    @GetMapping("/look")
    public String showRabbit(@RequestParam(name = "namerabbit", required = false) String name ,Model model){
        System.out.println(name);
        Rabbit rabbit = rabbitService.getRabbitByName(name);

        if (rabbit != null){
            model.addAttribute("monlapin",rabbit);
            return "pagec";
        }
        else {
            return "paged";
        }


    }




}
