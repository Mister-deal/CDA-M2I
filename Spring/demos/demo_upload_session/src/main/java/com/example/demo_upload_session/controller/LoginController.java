package com.example.demo_upload_session.controller;


import com.example.demo_upload_session.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/exercice")
@AllArgsConstructor
public class LoginController {

    private LoginService loginService;

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String submitLogin(@RequestParam String login,@RequestParam String password){
        if (loginService.login(login,password)){
            return "protected";
        }
        return "login";
    }

    @GetMapping("/protected")
    public String protectedPage(){
        if(loginService.isLogged()){
            return "protected";
        }
        return "redirect:/exercice/login";
    }


}
