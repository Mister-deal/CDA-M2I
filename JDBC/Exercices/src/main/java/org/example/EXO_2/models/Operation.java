package org.example.EXO_2.models;

public class Operation {


    private int id;
    private int numero;
    private double montant;
    private Statut statut;

    public Operation(){
    };

    public Operation(int id, int numero, double montant, Statut statut) {
        this.id = id;
        this.numero = numero;
        this.montant = montant;
        this.statut = statut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", numero=" + numero +
                ", montant=" + montant +
                ", statut=" + statut +
                '}';
    }
}
