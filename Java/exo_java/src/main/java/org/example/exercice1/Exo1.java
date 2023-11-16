package org.example.exercice1;

import java.util.Scanner;

public class Exo1 {

    public static void getExo1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un nombre :");
        Integer nombre = scanner.nextInt();
        System.out.println("Le nombre saisi au carré est :" + (nombre * nombre) );


    }

}
