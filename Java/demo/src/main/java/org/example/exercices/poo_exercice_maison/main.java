package org.example.exercices.poo_exercice_maison;

public class main {
    public static void main(String[] args) {
        // Création d'une maison avec une surface de 100m2
        House myHouse = new House(100);

        // Définir la couleur de la porte de la maison
        myHouse.getDoor().setColor("rouge");

        // Afficher les informations sur la maison
        myHouse.display();

        // Création d'un appartement
        Apartment myApartment = new Apartment();

        // Afficher les informations sur l'appartement
        myApartment.getDoor().setColor("beige");
        myApartment.display();

        // Création d'une personne avec une maison
        Person person = new Person("John", myHouse);

        // Afficher les informations sur la personne
        person.display();
    }
}
