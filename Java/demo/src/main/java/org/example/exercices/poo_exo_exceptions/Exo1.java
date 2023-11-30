package org.example.exercices.poo_exo_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo1 {

    public static void Exercice1() {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("donne moi quelque chose");
            String valeur = scanner.next();
            int number = Integer.parseInt(valeur);
            System.out.println("réussite : " + number);

        }
        catch (NumberFormatException e){
            System.out.println("problème");
            e.printStackTrace();
        }

    }
}
