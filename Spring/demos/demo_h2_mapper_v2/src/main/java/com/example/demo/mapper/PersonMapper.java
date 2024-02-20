package com.example.demo.mapper;


import com.example.demo.entities.Person;
import com.example.demo.model.PersonDTO;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PersonMapper {

   // @Mapping(source = "firstName", target = "blabla")
   // @Mapping(source = "birthDate", target = "age", qualifiedByName = "convertDateToAge")
    public PersonDTO personToPersonDto(Person person){
       return new PersonDTO(person.getId(), person.getFirstName(), person.getLastName(), person.getBirthDate(),convertDateToAge(person.getBirthDate()));
    };


 //   @Mapping(source = "blabla", target = "firstName")
    public Person personDtoToPerson(PersonDTO dto){
       return new Person(dto.getId(), dto.getBlabla(), dto.getLastName(), dto.getBirthDate());
    };


   // @Named("convertDateToAge")
    public static Integer convertDateToAge(LocalDate date){
        LocalDate now = LocalDate.now();

        Integer age = now.getYear() - date.getYear();

        if(now.minusYears(age).isBefore(date)){
            age--;
        }

        return age;
    }

}
