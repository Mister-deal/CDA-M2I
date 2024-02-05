package com.example.demoapirest.services;

import com.example.demoapirest.entities.Person;

public interface PersonService {

    Person save(String firstname, String lastname);
}
