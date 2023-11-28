package org.example.exercices.poo_exercice_hotel;

public class Chambre {

    private int number;

    private String status;

    private double tarification;

    private int capacity;

    public Chambre(int number, double tarification, int capacity) {
        this.number = number;
        this.status = "available";
        this.tarification = tarification;
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTarification() {
        return tarification;
    }

    public void setTarification(double tarification) {
        this.tarification = tarification;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Chambre " + number + " - Statut : " + status + " - Tarif : " + tarification + " - Capacité : " + capacity;
    }
}
