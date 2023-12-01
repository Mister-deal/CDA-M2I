package org.example.exercices.Tp_billetterie;

public class Evenement {

    private String nom;
    private String date;
    private String heure;
    private Lieu lieu;
    private double prix;
    private int billetsVendus;

    public Evenement(String nom, String date, String heure, Lieu lieu, double prix, int billetsVendus) {
        this.nom = nom;
        this.date = date;
        this.heure = heure;
        this.lieu = lieu;
        this.prix = prix;
        this.billetsVendus = 0;
    }

    public boolean verifierDisponibiliteBillet() {
        return billetsVendus < lieu.getCapacite();
    }

    public void vendreBillet() {
        if (verifierDisponibiliteBillet()) {
            billetsVendus++;
        } else {
            System.out.println("Désolé, les billets sont épuisés pour cet événement.");
        }
    }

    public void annulerVenteBillet() {
        if (billetsVendus > 0) {
            billetsVendus--;
        } else {
            System.out.println("Aucun billet à annuler.");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getBilletsVendus() {
        return billetsVendus;
    }

    public void setBilletsVendus(int billetsVendus) {
        this.billetsVendus = billetsVendus;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "nom='" + nom + '\'' +
                ", date='" + date + '\'' +
                ", heure='" + heure + '\'' +
                ", lieu=" + lieu +
                ", prix=" + prix +
                ", billetsVendus=" + billetsVendus +
                '}';
    }
}
