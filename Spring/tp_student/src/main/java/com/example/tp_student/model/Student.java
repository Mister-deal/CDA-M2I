package com.example.tp_student.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private UUID id;
    private String name;
    private String surname;
    private int age;
    private String email;
}
