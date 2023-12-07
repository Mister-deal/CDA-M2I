package org.example.classes;

public class LivrePapier extends Livre {
    private int nbPage;
    private String maisonEdition;


    public LivrePapier(String titre, String auteur, int nbPage, String maisonEdition) {
        super(titre, auteur);
        this.nbPage = nbPage;
        this.maisonEdition = maisonEdition;
    }

    @Override
    public String toString() {
      //  String strParent = super.toString();
        return super.toString() +
                "LivrePapier : " +
                "nbPage=" + nbPage +
                ", maisonEdition='" + maisonEdition + '\'' +
                '.';
    }
}
