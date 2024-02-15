package com.example.exercice_student.controller;

import com.example.exercice_student.model.Student;
import com.example.exercice_student.service.IStudentService;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class StudentController {

   private final IStudentService studentService;

    @Value("${academy.name}")
    private  String academyName;

    @Value("${academy.contact}")
    private String academyContact;

    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping  // http://localhost:8080
    public String home(Model model){
        model.addAttribute("name",academyName);
        model.addAttribute("contact",academyContact);
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
    @GetMapping("/update/{id}")
    public String formUpdateStudent(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "updateForm";
    }

    @PutMapping("/update/{id}")
    public String UpdateStudent(@PathVariable Long id, @ModelAttribute("student") Student student){
        student.setId(id);
        studentService.updateStudent(student);
        return "redirect:/students";
    }


    @PostMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        Student studentDelete = studentService.getStudentById(id);
        studentService.deleteStudent(studentDelete);
        return "redirect:/students";
    }



}
