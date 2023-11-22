package org.example.exercices.poo_exercice_maison;

public class House {
    private double surface;
    private Door door;

    public House(double surface) {
        this.surface = surface;
        this.door = new Door();
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public Door getDoor() {
        return door;
    }

    public void display() {
        System.out.println("Je suis une maison, ma surface est de " + surface + " m2");
        door.display();
    }
}