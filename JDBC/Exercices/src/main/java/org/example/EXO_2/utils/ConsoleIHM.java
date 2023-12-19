package org.example.EXO_2.utils;

import org.example.EXO_2.service.ClientService;

import java.util.Scanner;

public class ConsoleIHM {

    private static ClientService clientService = new ClientService();

    private static Scanner scanner = new Scanner(System.in);
    public static void start() {
        boolean running = true;
        while (running) {
            System.out.println("1. Créer client");
            System.out.println("2. Assigner compte bancaire à Client");
            System.out.println("3. Depot d'argent");
            System.out.println("4. Retrait d'argent");
            System.out.println("5. Afficher solde et retrait du compte");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    createClient();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        System.out.println("Au revoir !");
    }

    private static void createClient() {
        System.out.print("prenom  : ");
        String firstName = scanner.nextLine();
        System.out.print("nom : ");
        String lastName = scanner.nextLine();
        System.out.print("telephone : ");
        String telephone = scanner.nextLine();


        clientService.createClient(firstName,lastName,telephone);
    }
}
