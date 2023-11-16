package org.example.exo_Condition;

import java.util.Scanner;

public class Exo2 {

        public static Scanner s = new Scanner(System.in);

            public static void solutionExo35(){
                System.out.println("merci de saisir un âge :");
                int age = s.nextInt();

                if(age > 5 && age < 8){
                    System.out.println("c'est un poussin");
                }else if(age > 7 && age  < 10){
                    System.out.println("c'est un pupille");
                }else if(age > 9 && age < 12){
                    System.out.println("c'est un minime");
                }else if(age > 12 && age < 18){
                    System.out.println("c'est un cadet");
                }else{
                    System.out.println("la personne est soit trop jeune ou trop âgée");
                }
            }

            public static void solutionExo36(){
                System.out.println("merci de saisir une valeur numérique :");
                int nombre = s.nextInt();

                if(nombre % 3 == 0){
                    System.out.println("ce nombre est divisible par 3");
                }else{
                    System.out.println("ce nombre n'est pas divisible par 3");
                }
            }

            public static void solutionExo37(){
                System.out.println("merci de saisir le nombre de copies");
                int copie = s.nextInt();

                if(copie < 10){
                    System.out.println("prix des copies : " + (copie * 0.15) + " centimes d'euros");
                }else if(copie >= 10 && copie <= 20){
                    System.out.println("prix des copies : " + (copie * 0.10) + " euros");
                }else if(copie > 20){
                    System.out.println("prix des copies : " + (copie * 0.05) + "euros");
                }

            }

    public static void solutionExo34() {
        System.out.print("Entrez un nombre : ");
        int nombre = s.nextInt();

        if (nombre > 0) {
            System.out.println("Le nombre est positif.");
        } else if (nombre < 0) {
            System.out.println("Le nombre est négatif.");
        } else {
            System.out.println("Le nombre est égal à zéro.");
        }

        s.close();
    }

    public static void solutionExo51(){

    int nombre;
        do{
            System.out.println("veuillez entrer une valeur numéraire :");
            nombre = s.nextInt();

            if(nombre < 1 || nombre > 3){
                System.out.println("Veuillez entrer un nombre entre 1 et 3.");
            } else if(nombre == 2){
                System.out.println("Bravo, vous avez trouvé la valeur !");
            }
        } while (nombre < 1 || nombre > 3);
        System.out.println("Vous avez choisi le nombre : " + nombre);
    }

    public static void solutionExo52() {
        int nombre;

        do {
            System.out.print("Entrez un nombre et trouvez la valeur : ");
            nombre = s.nextInt();

            if (nombre < 10) {
                System.out.println("Plus grand !");
            } else if (nombre > 20) {
                System.out.println("Plus petit !");
            }

        } while (nombre < 10 || nombre > 20);

        System.out.println("Vous avez choisi le nombre : " + nombre);

    }

    public static void solutionExo54() {
        System.out.println("veuillez entrer une valeur :");
        int n = s.nextInt();


        for(int i = 1; i <= 10; i++ ){
            int nS = n + i;
            System.out.println(nS);
        }
    }


    public static void solutionExo55(){
        System.out.print("Entrez un nombre de départ : ");
        int nombreDeDepart = s.nextInt();

        System.out.println("Table de " + nombreDeDepart + " :");
        for (int i = 1; i <= 10; i++) {
            int resultat = nombreDeDepart * i;
            System.out.println(nombreDeDepart + " x " + i + " = " + resultat);
        }
    }
}
