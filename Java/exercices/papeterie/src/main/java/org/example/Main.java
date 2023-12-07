package org.example;


import org.example.classes.*;

public class Main {
    public static void main(String[] args) {
        new Stylo("s1","stylo1",4,"blue");
        Stylo monStylo1 = new Stylo("s2","stylo2",1,"red");
        Stylo monStylo2 = new Stylo("s3","stylo3",3,"green");

        Ramette ramette = new Ramette("r1","ramette1",44,5);
        Ramette ramette1 = new Ramette("r2","ramette2",5,2);
        Ramette ramette2 = new Ramette("r3","ramette3",6,3);

        Lot lotstylo = new Lot("l1","s2",55,10);

        System.out.println();
        System.out.println("Affice un stylo : ");
        System.out.println(Article.getArticle("s1"));
        System.out.println();
        System.out.println("Affice un lot : ");
        System.out.println(Article.getArticle("l1"));
        System.out.println();

        Facture facture = new Facture("toto","novembre 2023",2);
        facture.ajouterLigne("l1",1);
        facture.ajouterLigne("r2",43);

        System.out.println();
        System.out.println("Affiche une facture de 2 lignes : ");
        facture.afficheToi();
        System.out.println();

        System.out.println("Nombre d'article en BDD : "+Article.nbArticleBDD());

    }
}