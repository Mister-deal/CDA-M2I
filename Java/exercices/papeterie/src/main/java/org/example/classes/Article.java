package org.example.classes;

import java.util.HashMap;

public abstract class Article {

    private String reference;

    private static HashMap<String,Article> bdd = new HashMap<>();

    protected Article(String reference){
        this.reference = reference;
        // Enregistrement en bdd
        bdd.put(reference,this);

    }

    public String getReference() {
        return reference;
    }

    public static Article getArticle(String ref){
        return bdd.get(ref);
    }

    public static int nbArticleBDD(){
        return bdd.size();
    }

    public abstract String getNom();

    public abstract double getPU();

    @Override
    public String toString() {
        return "Article : " +
                "reference = '" + reference + '\''+
                "nom = '" + getNom() + '\''+
                "PU = '" + getPU() + '\'';

    }
}
