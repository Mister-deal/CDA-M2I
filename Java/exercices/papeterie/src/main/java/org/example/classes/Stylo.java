package org.example.classes;

public class Stylo extends ArticleUnitaire{

    private String couleur;


    public Stylo(String reference, String nom, double pu,String couleur) {
        super(reference, nom, pu);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString()+ " couleur :"+ couleur;
    }
}
