package org.example.exercices.poo_exo_exceptions;

public class Exo2 {

    public static void exercice2(){
        int[] tableau = {10, 20, 50 , 64 , 75};

        int index = 7;

        try{
            int element = tableau[index];
            System.out.println("element index " + index + " est :" + element);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("problème dans la récupération de l'index");
            e.printStackTrace();
        }
    }
}
