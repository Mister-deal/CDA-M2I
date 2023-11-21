package org.example.exercices;

import java.util.Scanner;

public class Exo6 {

    public static void exo1(){
        Scanner s = new Scanner(System.in);

        System.out.println("veuillez entrer plusieurs valeurs numéraires espacées");
        String data = s.nextLine();

        String[] nombreString = data.split("\\s+");

        int[] nombres = new int[nombreString.length];

        for(int i = 0; i < nombreString.length; i++){
            try{
                nombres[i] = Integer.parseInt(nombreString[i]);
            } catch (NumberFormatException exception) {
                System.out.println("Erreur de format");
                return;
            }
        }

        System.out.println("Tableau d'entiers créé : ");
        for (int nombre : nombres) {
            System.out.print(nombre + " ");
        }
        int max = findMaxNumber(nombres);
        System.out.println("; la valeur la plus élevée est : " + max);
    }

    public static int findMaxNumber(int[] nombres){
        int max = nombres[0];
        for(int i = 0; i < nombres.length; i++){
            if(nombres[i] > max){
                max = nombres[i];
            }
        }
        return max;
    }

    public static void exo2() {
        Scanner s = new Scanner(System.in);

        System.out.println("veuillez entrer la hauteur");
        int hauteur = s.nextInt();

        System.out.println("veuillez entrer la largeur");
        int largeur = s.nextInt();

        impression(hauteur, largeur);

    }

    public static void impression(int hauteur, int largeur){
        for(int i = 0; i < hauteur; i++){
            for (int j = 0; j < largeur; j++){
                if(i == 0 || i == hauteur - 1 || j == 0 || j == largeur - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void exo3(){
        Scanner s = new Scanner(System.in);

        System.out.println("veuillez entrer une phrase afin que l'algo puisse vous dire le nombre de mots :");
        String data = s.nextLine();
        System.out.println(getWords(data));
    }
    public static int getWords(String data){
        return data.split("\\s+").length;
    }
}
