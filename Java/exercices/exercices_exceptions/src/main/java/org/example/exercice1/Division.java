package org.example.exercice1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le numérateur : ");
        int numerateur = scanner.nextInt();

        System.out.println("Entrez le dénominateur : ");
        int denominateur = scanner.nextInt();

        try {
            int resultat = diviser(numerateur,denominateur);
            System.out.println("Résultat de la division : "+ resultat);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }

    public static int diviser(int numerateur,int denominateur){
        if(denominateur == 0){
            throw new ArithmeticException("Division par zéro impossible");
        }
        return numerateur / denominateur;
    }
}
