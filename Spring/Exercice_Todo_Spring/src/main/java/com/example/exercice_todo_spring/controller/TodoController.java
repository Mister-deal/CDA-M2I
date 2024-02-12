package com.example.exercice_todo_spring.controller;

import com.example.exercice_todo_spring.entity.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    Todo todo = new Todo("ranger cuisine", "pour préparer venue amis", false);
    Todo todo1 = new Todo("ranger salle de bain", "pour préparer venue amis", true);
    Todo todo2 = new Todo("faire à manger", "pour préparer venue amis", true);

    @RequestMapping("api/home")
    public String sayHello(){
        System.out.println();
        return "home";
    }
    @RequestMapping("api/home/todos")
    public String todos(Model model){
        model.addAttribute("name", "ranger chambre");
        model.addAttribute("description", "ranger chambre avant copine qui rentre");
        model.addAttribute("done", false);

        List<String> todos = List.of("name : faire à manger", "description : nourrir copine", "done : false",
                "name : faire à boire", "description : fabriquer boisson", "done : false",
                "name : faire la vaisselle", "description : satisfaire copine", "done : false");
        List<Todo> todos2 = List.of(todo, todo1, todo2);
        model.addAttribute("todos", todos);
        model.addAttribute("todos2", todos2);
        List<Todo> todos3 = List.of(new Todo("manger gateau", "gouter le gateau de la belle-mère", true),
                new Todo("nettoyer la douche", "blabla", true),
                new Todo("nourrir le chien", "ouaf", false));
        model.addAttribute("todos3", todos3);
        return "todos";
    }
}
