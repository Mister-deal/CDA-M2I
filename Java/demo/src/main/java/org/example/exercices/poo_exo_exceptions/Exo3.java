package org.example.exercices.poo_exo_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exo3 {
    public static void exercice3(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("EXERCICE 3");
            System.out.println("donne moi un nombre");
            Integer number = scanner.nextInt();
            System.out.println("donne moi un diviseur");
            Integer divider = scanner.nextInt();
            double result = number / divider;
            System.out.println("resultat : " + result);
        }catch (ArithmeticException e){
            System.out.println("problème détecté :" + e.getMessage());
            System.out.println("vous ne pouvez pas diviser par zéro");
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.println("vous n'avez pas entré une ou des valeurs numéraires; veuillez réessayer");
            e.printStackTrace();
        }
        System.out.println("fin du programme !");
    }
}
