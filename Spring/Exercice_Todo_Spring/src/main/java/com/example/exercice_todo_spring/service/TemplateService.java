package com.example.exercice_todo_spring.service;

import com.example.exercice_todo_spring.entity.Todo;

import java.util.List;

public interface TemplateService {

    String sayHello();
    List<Todo> getAllTodos();

}
