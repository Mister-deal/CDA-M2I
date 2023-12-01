package org.example.exercices.Tp_billetterie;

import java.util.Scanner;

public class Billetterie {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int choix;
        do {
            System.out.println("1. Gérer les lieux");
            System.out.println("2. Gérer les événements");
            System.out.println("3. Gérer les clients");
            System.out.println("4. Acheter un billet");
            System.out.println("5. Annuler un achat de billet");
            System.out.println("6. Afficher la liste des événements disponibles");
            System.out.println("7. Afficher la liste des billets achetés par un client");
            System.out.println("0. Quitter");

            System.out.print("Choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

        } while (choix != 0);
    }

}
