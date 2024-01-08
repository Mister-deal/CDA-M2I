package org.example.dao;

import exercices.todolist.src.main.java.org.example.model.Person;


import java.util.List;

public interface PersonDAO {

    public void addPerson(Person person);

    public void deletePerson(Long id);

    public List<Person> getAllPersons();
}
