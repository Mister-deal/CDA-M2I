package org.example.exercices.tp_biblio;

public class LivrePapier extends Livre{
    private int nbPage;
    private String nomEd;

    public LivrePapier(String titre, String auteur, int nbPage, String nomEd) {
        super(titre, auteur);
        this.nbPage = nbPage;
        this.nomEd = nomEd;
    }
}
