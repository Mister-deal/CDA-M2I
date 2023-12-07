package org.example.exercice5;

import java.util.Scanner;

public class SommeTableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[6];
        int sum = 0;
        try {
            System.out.println("Entrer les élements du tableau : ");
            for (int i = 0;i < tableau.length;i++){
                try {
                    tableau[i] = Integer.parseInt(scanner.next());
                    sum += tableau[i];
                }catch (NumberFormatException e){
                    System.out.println("Erreur : l'élement n° "+(i+1)+" n'est pas un nombre valide veuillez recommencer :");
                    i--;
                }
            }
            if(sum == 0){
                System.out.println("Erreur : le tableau est vide ou vous n'avez saisie que des 0 !!!");
            }else {
                System.out.println("La somme des elements de mon tableau est de : "+sum);
                for (int i = 0;i < tableau.length;i++){
                    System.out.println(tableau[i]);
                }
            }

        } catch (Exception e) {
            System.out.println("Erreur : Impossible de lire à partir de la console");
        }
    }
}
