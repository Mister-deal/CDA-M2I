package org.example.exercices.poo_exercice_maison;

public class Door {
    private String color;
    //création d'un getter afin d'y inscrire les données de color
    public String getColor() {
        return color;
    }

    //création d'un setter de couleur
    public void setColor(String color) {
        this.color = color;
    }
    //création d'une méthode pouvant récupérer la couleur
    public void display() {
        System.out.println("Je suis une porte, ma couleur est " + color);
    }
}
