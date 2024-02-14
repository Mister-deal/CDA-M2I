package com.example.exercice_todo_spring.controller;

import com.example.exercice_todo_spring.entity.Todo;
import com.example.exercice_todo_spring.service.TemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class TodoRestController {

    private final TemplateService templateService;

    public TodoRestController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @GetMapping("/todo")
    public Todo getTodo(){
        return new Todo("test1", "description1", true);
    }
    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        System.out.println(templateService.getAllTodos());
        return templateService.getAllTodos();
    }
    

}
