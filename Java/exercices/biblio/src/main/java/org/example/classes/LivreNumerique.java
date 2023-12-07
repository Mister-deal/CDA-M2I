package org.example.classes;

public class LivreNumerique extends Livre{
    private String format;
    private Long taille;


    public LivreNumerique(String titre, String auteur,String format,Long taille) {
        super(titre, auteur);
        this.format = format;
        this.taille = taille;
    }

    public String getFormat() {
        return format;
    }

    public Long getTaille() {
        return taille;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "LivreNumerique :" +
                "format='" + format + '\'' +
                ", taille=" + taille +
                '.';
    }
}
