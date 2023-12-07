package org.example.classe;

import org.example.enums.StatutChambre;
import org.example.enums.StatutReservation;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IHMConsole {
    private static Scanner scanner = new Scanner(System.in);

    private static Hotel hotel;

    public static void start(){
        System.out.println("Quel est le nom de l'hotel ?");
        String hotelName = scanner.nextLine();



        initialisationHotel(hotelName);
        menu();
    }

    public static void initialisationHotel(String hotelName) {
        hotel = new Hotel(hotelName,new Chambre[]{
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33),
                new Chambre(3,33)
        });
    }

    public static void menu(){
        String propositions[] = {
                "1- Ajouter un client",
                "2- Afficher la liste des clients",
                "3- Afficher les réservations d’un client",
                "4- Ajouter une réservation",
                "5- Annuler une réservation",
                "6- Afficher la liste des réservations",
                "0- Quitter"
        };

        System.out.println("Bienvenue à l'hotel : "+hotel.getName());
        for (String p: propositions){
            System.out.println(p);
        }

      //  int choice = scanner.nextInt();
        int choice = parseInt(scanner.next()) ;

        switch (choice){
            case 1 -> {
                addClient();
                menu();
            }
            case 2 -> {
                showClient();
                menu();
            }
            case 3 -> {
                showReservationByClient();
                menu();
            }
            case 4 -> {
                addReservation();
                menu();
            }
            case 5 -> {
                cancelReservation();
                menu();
            }
            case 6 -> {
                showAllReservations();
                menu();
            }
            case 0 -> {
                break;
            }
            default -> {
                System.out.println("Choix invalide");
                menu();
            }
        }

    }

    private static void addClient(){
        System.out.println("Ajout d'un client");
        System.out.println("Nom du client : ");
        String lastNameClient = scanner.next();
        System.out.println("PreNom du client : ");
        String firstNameClient = scanner.next();
        System.out.println("Telephone du client : ");
        String phoneClient = scanner.next();

        if( hotel.addClient(firstNameClient,lastNameClient,phoneClient)){
            System.out.println("Client ajouté");
        }else {
            System.out.println("erreur");
        }

    }
    private static void showClient(){
        System.out.println("Affichage infos client");
        for (Client c : hotel.getClients()) {
           if(c != null){
               System.out.println(c);
           }

        }
    }
    private static void showReservationByClient(){
        System.out.println("Affichage reservation client");
        System.out.println("Quelle est l'id du client ?");
        int idClient = parseInt(scanner.next());
        for (Reservation r : hotel.getReservations()) {
            if(r != null){
                if(r.getClient().getId() == idClient) {
                    System.out.println(r);
                }
            }

        }

    }
    private static void addReservation(){
        System.out.println("Ajout d'une reservation");
        System.out.println("Quelle est l'id du client ?");
        int idClient = parseInt(scanner.next());
        System.out.println("Quelle est l'id de la chambre ?");
        int idChambre = parseInt(scanner.next());
        if(hotel.getChambres()[idChambre-1].getStatut() == StatutChambre.FREE){
            Reservation reservation = new Reservation(hotel.getClients()[idClient-1],hotel.getChambres()[idChambre-1], StatutReservation.VALIDATED );
            hotel.getChambres()[idChambre-1].setStatut(StatutChambre.TAKEN);
            hotel.addReservation(reservation);
            System.out.println("reservation ajouté");
        }else {
            System.out.println("Chambre indisponible");
        }


    }
    private static void cancelReservation(){
        System.out.println("Annulation d'un reservation");
        System.out.println("Quelle est l'id de la reservation ?");
        int idReservation = parseInt(scanner.next());
        Reservation reservation = hotel.getReservations()[idReservation-1];
        Chambre chambre = reservation.getChambre();
        chambre.setStatut(StatutChambre.FREE);
        reservation.setStatut(StatutReservation.CANCELED);
    }
    private static void showAllReservations(){
        System.out.println("Affichage de toutes les reservations");
        for (Reservation r : hotel.getReservations()) {
            if(r != null){
                System.out.println(r);
            }

        }
    }

}
