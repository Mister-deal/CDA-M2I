package org.example.exercices.poo_exercice_maison;

public class Person {
    private String name;
    private House house;

    public Person(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public void display() {
        System.out.println("je suis " + name + " et je suis le proprio.");
    }
}
