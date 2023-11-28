package org.example.exercices.poo_exercice_hotel;

public class Reservation {

    private static int counter = 1;

    private int number;

    private String statut;
    private Client client;

    private Chambre chambre;

    public Reservation(Client client, Chambre chambre) {
        this.client = client;
        this.chambre = chambre;
        this.number = counter++;
        this.statut = "on hold";
    }
    public void cancelReservation(){
        this.statut = "cancelled";
        this.chambre.setStatus("available");
    }

    @Override
    public String toString() {
        return "Réservation " + number + " - Statut : " + statut + "\n" + client + "\n" + chambre;
    }
}
