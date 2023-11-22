package org.example.exercices.poo_exercice_maison;

public class Door {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Je suis une porte, ma couleur est " + color);
    }
}
