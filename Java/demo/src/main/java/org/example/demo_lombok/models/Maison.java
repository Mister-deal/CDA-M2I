package org.example.models;


import lombok.Data;

@Data
public class Maison {
    private final int id;
    private String ville;
    private int numero;
    private String adresse;
}
