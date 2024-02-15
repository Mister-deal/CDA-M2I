package com.example.tp_student.controller;

import com.example.tp_student.model.Student;
import com.example.tp_student.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api/student")
public class StudentRestController {

    private final StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    public Student getStudentId(UUID uuid){
        return studentService.getStudentById(uuid);
    }
}
