package com.example.exercice_student.service;

import com.example.exercice_student.model.Student;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
@NoArgsConstructor
public class StudentServiceImpl implements IStudentService{




    private List<Student> students = new ArrayList<>();

    private Long currentId = 1L;

    @Override
    public Student createStudent(Student student) {
        student.setId(currentId++);
        students.add(student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        Student studentUpdate = students.get(Math.toIntExact(student.getId()));
        if(studentUpdate != null){
            studentUpdate.setFirstName(student.getFirstName());
            studentUpdate.setLastName(student.getLastName());
            studentUpdate.setAge(student.getAge());
            studentUpdate.setEmail(student.getEmail());
            return studentUpdate;
        }else {
            return null;
        }
    }

    @Override
    public Student deleteStudent(Student student) {
        Student studentDelete = students.get(Math.toIntExact(student.getId()));
        if (studentDelete != null){
            students.remove(studentDelete);
            return studentDelete;
        }else {
            return null;
        }
    }

    @Override
    public Student getStudentById(Long id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public List<Student> searchStudents(String search) {
        return students.stream()
                .filter(student -> student.getFirstName().toLowerCase().contains(search.toLowerCase()) || student.getLastName().toLowerCase().contains(search.toLowerCase())).toList();
    }
}
