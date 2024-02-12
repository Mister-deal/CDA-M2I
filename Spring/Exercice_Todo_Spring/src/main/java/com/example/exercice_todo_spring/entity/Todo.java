package com.example.exercice_todo_spring.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Todo {
    private String name;
    private String description;
    private Boolean done;


}
