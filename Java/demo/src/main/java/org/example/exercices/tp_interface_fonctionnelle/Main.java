package org.example.exercices.tp_interface_fonctionnelle;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){

        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit("ordinateur", 120.00, "informatique"));
        produits.add(new Produit("ordinateur portable", 350.00, "informatique"));
        produits.add(new Produit("ordinateur all-in-one", 500.00, "informatique"));
        produits.add(new Produit("Nokia A12", 200.99, "Smartphone"));
        produits.add(new Produit("Apple phone", 510.00, "Smartphone"));
        System.out.println(produits.toString());
    }
}
