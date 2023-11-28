package org.example.exercices.poo_exercice_hotel;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Chambre> chambres;
    private ArrayList<Client> clients;

    private ArrayList<Reservation> reservations;

    public Hotel(String name, int nombreChambres) {
        this.name = name;
        this.chambres = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.clients = new ArrayList<>();

        for(int i = 1; i <= nombreChambres; i++){
            Chambre chambre = new Chambre(i, 100.0, 2);
            this.chambres.add(chambre);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }
    public void addClient(Client client){
        this.clients.add(client);
    }
}
