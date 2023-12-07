package org.example.classes;

public abstract class ArticleUnitaire extends Article{

    private String nom;

    private double pu;

    public ArticleUnitaire(String reference,String nom,double pu) {
        super(reference);
        this.nom = nom;
        this.pu = pu;
    }

    @Override
    public String getNom(){
        return nom;
    }

    @Override
    public double getPU() {
        return pu;
    }




}
