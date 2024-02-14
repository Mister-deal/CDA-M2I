package com.example.exercice_student.controller;

import com.example.exercice_student.model.Student;
import com.example.exercice_student.service.IStudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@AllArgsConstructor
public class StudentController {

   private final IStudentService studentService;

    @GetMapping  // http://localhost:8080
    public String home(){
        return "home";
    }

    @GetMapping("/students") // http://localhost:8080/students http://localhost:8080/students?search=toto
    public String showAllStudents(@RequestParam(name = "search",required = false) String search, Model model){
        if(search == null){
            model.addAttribute("students",studentService.getAllStudents());

        }else {
            model.addAttribute("students",studentService.searchStudents(search));
        }
       return "list";
    }

    @GetMapping("/student/{id}")  // http://localhost:8080/student/x
    public String showStudent(@PathVariable Long id,Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "detail";
    }

    @GetMapping("/formulaire") // http://localhost:8080/formulaire
    public String formAddStudent(Model model){
        model.addAttribute("student",new Student());
        return "form";
    }

    @PostMapping("/student")
    public String addStudent(@ModelAttribute("student") Student student){
        studentService.createStudent(student);
        return "redirect:/students";

    }


}
