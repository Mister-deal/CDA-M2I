package org.example.classe;

import org.example.enums.StatutChambre;

public class Chambre {

    private int number;

    private static int counter = 0;

    private int capacity;

    private double tarif;

    private StatutChambre statut;

    public Chambre(int capacity, double tarif) {
        this.number = ++counter;
        this.statut = StatutChambre.FREE;
        this.capacity = capacity;
        this.tarif = tarif;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Chambre.counter = counter;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public StatutChambre getStatut() {
        return statut;
    }

    public void setStatut(StatutChambre statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "number=" + number +
                ", capacity=" + capacity +
                ", tarif=" + tarif +
                ", statut=" + statut +
                '}';
    }
}
