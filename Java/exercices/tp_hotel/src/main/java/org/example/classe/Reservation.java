package org.example.classe;


import org.example.enums.StatutReservation;

public class Reservation {

    private static int count = 0;

    private int numero;

    private Client client;

    private Chambre chambre;

    private StatutReservation statut;

    public Reservation(Client client, Chambre chambre, StatutReservation statut) {
        this.numero = ++count;
        this.client = client;
        this.chambre = chambre;
        this.statut = statut;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public StatutReservation getStatut() {
        return statut;
    }

    public void setStatut(StatutReservation statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Reservation : " +
                "numero = " + numero +
                ", client = " + client +
                ", chambre = " + chambre +
                ", statut = " + statut +
                '.';
    }
}
