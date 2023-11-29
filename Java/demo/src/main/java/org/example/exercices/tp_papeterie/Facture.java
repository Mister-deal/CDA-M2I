package org.example.exercices.tp_papeterie;

import java.util.ArrayList;
import java.util.List;

public class Facture {
    private static int compteurFacture = 1; // Un compteur pour générer des numéros de facture uniques
    private int numeroFacture;
    private String client;
    private String date;
    private List<Ligne> lignes;

    public Facture(String client, String date, List<Ligne> lignes) {
        this.numeroFacture = compteurFacture++;
        this.client = client;
        this.date = date;
        this.lignes = new ArrayList<>();
    }
    public void ajouterLigne(Article articles, int quantite){
        Ligne nouvelleLigne = new Ligne(articles, quantite);
        lignes.add(nouvelleLigne);
    }

    public double getPrixTotal(){
        double prixTotal = 0;
        for(Ligne ligne : lignes){
            prixTotal += ligne.getPrixTotal();
        }
        return prixTotal;
    }
}
