package org.example.EXO_2.models;

import java.util.List;

public class Client {

    private int identifiant;

    private String firstName;

    private String lastName;

    private List<CompteBancaire> comptes;
    private String telephone;

    public Client(){

    }

    public Client(int identifiant, String firstName, String lastName, String telephone) {
        this.identifiant = identifiant;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
    }

    public Client(int identifiant, String firstName, String lastName, List<CompteBancaire> comptes, String telephone) {
        this.identifiant = identifiant;
        this.firstName = firstName;
        this.lastName = lastName;
        this.comptes = comptes;
        this.telephone = telephone;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<CompteBancaire> getComptes() {
        return comptes;
    }

    public void setComptes(List<CompteBancaire> comptes) {
        this.comptes = comptes;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "identifiant=" + identifiant +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", comptes=" + comptes +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
