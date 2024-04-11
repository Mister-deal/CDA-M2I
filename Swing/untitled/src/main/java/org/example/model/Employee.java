package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int id;
    private String nom;
    private Genre genre;

    private int age;
    private String groupeSanguin;
    private String numeroTel;
    private List<String> qualifications = new ArrayList<>();

    private LocalDate dateDebut;
    private String adresse;


}
