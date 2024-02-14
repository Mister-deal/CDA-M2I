package com.example.exercice_student.service;

import com.example.exercice_student.model.Student;

import java.util.List;

public interface IStudentService {

    Student createStudent(Student student);

    Student updateStudent(Student student);

    Student deleteStudent(Student student);
    Student getStudentById(Long id);

    List<Student> getAllStudents();

    List<Student> searchStudents(String search);
}
