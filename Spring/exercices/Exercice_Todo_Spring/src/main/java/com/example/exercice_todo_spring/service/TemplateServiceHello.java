package com.example.exercice_todo_spring.service;

import com.example.exercice_todo_spring.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("welcome")
public class TemplateServiceHello implements TemplateService{
    @Override
    public String sayHello() {
        return "Hello everyone and welcome to this project!";
    }

    @Override
    public List<Todo> getAllTodos() {
        return List.of(new Todo("manger gateau", "gouter le gateau de la belle-mère", true),
                new Todo("nettoyer la douche", "blabla", true),
                new Todo("nourrir le chien", "ouaf", false));
    }
}
