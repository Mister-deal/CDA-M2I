package com.example.demoapirest.services;

import com.example.demoapirest.entities.Person;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonServiceImpl implements PersonService {
    @Override
    public Person save(String firstname, String lastname) {
        return new Person(firstname, lastname);
    }
}
