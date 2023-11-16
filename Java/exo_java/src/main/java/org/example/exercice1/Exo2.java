package org.example.exercice1;

import java.util.Scanner;

public class Exo2 {

    public static void getHello(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("pouvez vous me remettre votre nom ?");
        String nom = scanner.next();
        System.out.println("Bonjour " + nom + ", c'est un plaisir de vous connaitre");

    }
}
