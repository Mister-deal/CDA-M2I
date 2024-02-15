package com.example.tp_student.controller;

import com.example.tp_student.model.Student;
import com.example.tp_student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping //http://localhost:8080
    public String getHomepage(){
        return "home";
    }
    @GetMapping("/registerStudent") //http://localhost:8080/registerStudent
    public String showRegistrationStudentForm(Model model){
        model.addAttribute("student", new Student());

        return "form/form";
    }
    @PostMapping("/registerStudent")//http://localhost:8080/
    public String submitStudent(@ModelAttribute("student") Student student){
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAge());
        System.out.println(student.getEmail());
        System.out.println(student.getId());
        studentService.add(student);
        return "redirect:/";
    }
    @GetMapping("listingStudents")
    public String listingStudents (Model model){
        List<Student> students = studentService.getAllStudents();
        Student student = students.get(0);
        model.addAttribute("idStudent", student.getId());

        model.addAttribute("students", students);
        return "listingStudents";
    }

    @GetMapping("/student/{id}")
    public String showStudent(@PathVariable UUID id, Model model){

    }




}
