package org.example.classes;

public class Livre {
    private static int compteur = 0;
    private int id;
    private String titre;
    private String auteur;


    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.id = ++compteur;
    }

    public static int getCompteur() {
        return compteur;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public String toString() {
        return "Livre :" +
                "id = " + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'';
    }
}
