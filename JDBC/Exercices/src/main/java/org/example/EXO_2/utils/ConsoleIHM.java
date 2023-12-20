package org.example.EXO_2.utils;

import org.example.EXO_2.models.Client;
import org.example.EXO_2.service.ClientService;
import org.example.EXO_2.service.CompteBancaireService;
import org.example.EXO_2.service.OperationService;

import java.util.List;
import java.util.Scanner;

public class ConsoleIHM {

    private static ClientService clientService = new ClientService();
    private static CompteBancaireService compteBancaireService = new CompteBancaireService();
    private static OperationService operationService = new OperationService();

    private static Scanner scanner = new Scanner(System.in);
    public static void start() {
        boolean running = true;
        while (running) {
            System.out.println("1. Créer client");
            System.out.println("2. créer compte bancaire");
            System.out.println("3. Assigner compte bancaire à Client");
            System.out.println("4. Depot d'argent");
            System.out.println("5. Retrait d'argent");
            System.out.println("6. Afficher solde et retrait du compte");
            System.out.println("7. Afficher tous les clients");
            System.out.println("8. Quitter");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    createClient();
                    break;
                case 2:
                    createAccount();
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
                    displayAllClients();
                    break;
                case 8:
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
    private static void createAccount() {
        System.out.println("Solde : ");
        Double solde = scanner.nextDouble();

        System.out.println("id de l'utilisateur à attribuer le compte : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Client client = clientService.getPerson(id);
        if(client == null){
            System.out.println("utilisateur non trouvé !");
            return;
        }
        compteBancaireService.createAccount(solde);
    }

    private static void displayAllClients(){
        List<Client> clients = clientService.getAllClients();
        for(Client client : clients){
            System.out.println(client);
        }
    }
}
