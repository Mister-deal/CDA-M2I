package com.example.tp_student.service;

import com.example.tp_student.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service("student")
public class StudentService implements Repository{
    private final Map<UUID, Student> students;

    public StudentService() {
        students = new HashMap<>();

        Student student1 = Student.builder()
                .id(UUID.randomUUID())
                .name("Taylor")
                .surname("james")
                .age(15)
                .email("j.taylor@gmail.com")
                .build();

        Student student2 = Student.builder()
                .id(UUID.randomUUID())
                .name("Yavarov")
                .surname("serguei")
                .age(16)
                .email("s.yava@gmail.com")
                .build();
        students.put(student1.getId(), student1);
        students.put(student2.getId(), student2);
    }

    @Override
    public boolean add(Student student) {
        if(student.getAge() > 21){
            throw new RuntimeException("this person is way too old for being in HighSchool");
        }
        if(student.getId() == null){
            student.setId(UUID.randomUUID());
            students.put(student.getId(), student);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Student getStudentById(UUID id) {
        return students.values().stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return students.values().stream().toList();
    }

    @Override
    public Student getStudentByName(String name) {
        return null;
    }

    @Override
    public List<Student> searchStudent(String search) {

    }
}
