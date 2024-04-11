package org.example.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Departement implements Serializable {
    private int id;
    private String nom;
    private List<Salarie> salaries;

    public Departement(String nom) {
        this.nom = nom;
    }

    public Departement(int id,String nom, List<Salarie> liste) {
        this.nom = nom;
        this.id = id;
        this.salaries = liste;
    }
    public Departement() {

    }
}
