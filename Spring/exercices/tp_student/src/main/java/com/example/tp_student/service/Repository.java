package com.example.tp_student.service;

import com.example.tp_student.model.Student;

import java.util.List;
import java.util.UUID;

public interface Repository {

     public boolean add(Student student);
     public Student getStudentById(UUID id);
     public List<Student> getAllStudents();
     public Student getStudentByName(String name);

    List<Student> searchStudent(String search);
}
