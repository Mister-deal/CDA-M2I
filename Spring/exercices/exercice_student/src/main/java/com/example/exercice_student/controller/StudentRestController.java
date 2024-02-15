package com.example.exercice_student.controller;


import com.example.exercice_student.model.Student;
import com.example.exercice_student.service.IStudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/academy")
@AllArgsConstructor
public class StudentRestController {

    private final IStudentService studentService;


    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        System.out.println(id);
        System.out.println(studentService.getStudentById(id));
        return studentService.getStudentById(id);
    }


}
