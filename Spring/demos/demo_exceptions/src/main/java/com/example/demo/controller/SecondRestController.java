package com.example.demo.controller;


import com.example.demo.exception.CustomException;
import com.example.demo.exception.SecondCustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondRestController {

    @GetMapping("/bye")
    public String hello(){
        Integer error = 25 / 0;
        return "bye world !!!";
    }


    @GetMapping("/byebye")
    public String bybye(){
        if (true){
            throw new CustomException("Oups !!!!");
        }

        return "Bye Bye World !!";
    }

    @GetMapping("/hellothere")
    public String helloThere(){
        if (true){
            throw new SecondCustomException("General Kenobi !!!");
        }

        return "Bye Bye World !!";
    }

}
