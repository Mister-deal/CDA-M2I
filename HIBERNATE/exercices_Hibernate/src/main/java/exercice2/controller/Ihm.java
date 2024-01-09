package exercice2.controller;

import exercice2.services.ProduitService;

import java.util.Scanner;

public class Ihm {

    private ProduitService produit;
    private Scanner scanner;

    public Ihm() {
        produit = new ProduitService();
        scanner = new Scanner(System.in);
    }

    public void start(){


    }

    public void menu(){

    }
}
