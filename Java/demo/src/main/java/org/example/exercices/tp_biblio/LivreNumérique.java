package org.example.exercices.tp_biblio;

public class LivreNumérique extends Livre {

    private int tailleOctets;

    private String format;

    public LivreNumérique(String titre, String auteur, int tailleOctets, String format) {
        super(titre, auteur);
        this.tailleOctets = tailleOctets;
        this.format = format;
    }
}
