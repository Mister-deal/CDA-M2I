package org.example.classes;

public class Ramette extends ArticleUnitaire{

    private int grammage;


    public Ramette(String reference, String nom, double pu,int grammage) {
        super(reference, nom, pu);
        this.grammage = grammage;
    }

    @Override
    public String toString() {
        return super.toString() + " grammage = "+ grammage;
    }
}
