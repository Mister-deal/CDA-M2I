package org.example.classe;

public class Hotel {

    private String name;

    private Chambre[] chambres;

    private Reservation[] reservations;

    private Client[] clients;

    private int cptIdClient = 0;
    private int cptIdReservation = 0;

    public Hotel(String name) {
        this.name = name;

    }

    public Hotel(String name, Chambre[] chambres) {
        this.name = name;
        this.chambres = chambres;
        this.reservations = new Reservation[100];
        this.clients = new Client[100];
    }

    public Hotel(String name, Chambre[] chambres, Reservation[] reservations, Client[] clients) {
        this.name = name;
        this.chambres = chambres;
        this.reservations = reservations;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chambre[] getChambres() {
        return chambres;
    }

    public void setChambres(Chambre[] chambres) {
        this.chambres = chambres;
    }

    public Reservation[] getReservations() {
        return reservations;
    }

    public void setReservations(Reservation[] reservations) {
        this.reservations = reservations;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    // Ajouter un client
    public boolean addClient(String firstName, String lastName, String phone){
        Client client = new Client(firstName, lastName, phone);
        if(cptIdClient < 100) {
            clients[cptIdClient++] = client;
            return true;
        }else {
            return false;
        }

    }

    // Ajouter une reservation
    public boolean addReservation(Reservation reservation){
        if(cptIdReservation < 100) {
            reservations[cptIdReservation++] = reservation;
            return true;
        }else {
            return false;
        }
    }


}
