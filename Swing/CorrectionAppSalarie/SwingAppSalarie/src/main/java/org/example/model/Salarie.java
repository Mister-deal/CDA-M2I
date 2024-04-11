package org.example.model;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.io.Serializable;

@Data
public class Salarie implements Serializable {
    private int id;
    private String nom;
    private String prenom;
    private Role role;
    private Departement departement;

    public Salarie(int id, String nom, String prenom, Role role, Departement departement) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
        this.departement = departement;
    }
    public Salarie(String nom, String prenom, Role role, Departement departement) {
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
        this.departement = departement;
    }

    public Salarie(int id,String nom, String prenom, Role role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
    }

    public Salarie() {
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", role=" + role +
                '}';
    }
}
