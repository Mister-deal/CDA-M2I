package com.example.tp_student.service;

import com.example.tp_student.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("student")
public class StudentService implements Repository{
    @Override
    public boolean add(Student student) {
        return false;
    }

    @Override
    public Student getStudentById(UUID id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentByName(String name) {
        return null;
    }
}
