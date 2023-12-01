package org.example.exercices.Tp_billetterie;

import java.util.ArrayList;

public class Client {

    private String nom;
    private String prenom;
    private String email;
    private ArrayList<Evenement> billetsAchetes;

    public Client(String nom, String prenom, String email, ArrayList<Evenement> billetsAchetes) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.billetsAchetes = new ArrayList<>();
    }

    public void acheterBillet(Evenement evenement) {
        if (evenement.verifierDisponibiliteBillet()) {
            billetsAchetes.add(evenement);
            evenement.vendreBillet();
        } else {
            System.out.println("Désolé, les billets sont épuisés pour cet événement.");
        }
    }

    public void annulerAchatBillet(Evenement evenement) {
        if (billetsAchetes.contains(evenement)) {
            billetsAchetes.remove(evenement);
            evenement.annulerVenteBillet();
        } else {
            System.out.println("Aucun achat de billet trouvé pour cet événement.");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Evenement> getBilletsAchetes() {
        return billetsAchetes;
    }

    public void setBilletsAchetes(ArrayList<Evenement> billetsAchetes) {
        this.billetsAchetes = billetsAchetes;
    }


}
