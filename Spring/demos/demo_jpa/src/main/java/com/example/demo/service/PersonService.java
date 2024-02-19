package com.example.demo.service;

import com.example.demo.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person findById(int id);

    Person save(Person person);

    Person update(Person person);

    void delete(Person person);


}
