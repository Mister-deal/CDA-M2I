package exercices.TpTodolist.Utils;

import java.util.Scanner;

public class ConsoleIHM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
                    case 8:
                        running = false;
                        break;
                    default:
                        System.out.println("Choix invalide !");
                }
            }
            System.out.println("Au revoir !");
        }

    }
}
