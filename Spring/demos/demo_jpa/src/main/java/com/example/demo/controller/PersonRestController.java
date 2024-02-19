package com.example.demo.controller;


import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonRestController {

    private PersonService personService;

    @GetMapping("/list")
    public List<Person> getAllPersons(){
        return personService.findAll();
    }

    @GetMapping("/addoneperson")
    public void addOnePerson(){
        personService.save(Person.builder()
                .firstName("toto")
                .lastName("tata")
                .email("toto@tata.com")
                .build());
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable int id){
        return personService.findById(id);
    }

    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person){
        return personService.save(person);
    }

    @DeleteMapping("/remove/{id}")
    public void deletePerson(@PathVariable int id){
        personService.delete(personService.findById(id));
    }

    @PutMapping("/update")
    public void updatePerson(@RequestBody Person person){
        personService.update(person);
    }


}
