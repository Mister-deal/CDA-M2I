package org.example;


import org.example.classes.*;

public class Main {
    public static void main(String[] args) {

        Bibliotheque biblio = new Bibliotheque();
        biblio.ajouterLivre(new LivrePapier("toto","titi",45,"la maison de toto"));
        biblio.ajouterLivre(new LivreNumerique("tata","tutu","epub",522L));
        biblio.ajouterLivre(new LivreNumerique("a suppr","supprt","epub",522L));

        System.out.println(biblio.trouverLivresParAuteur("t").size());
        biblio.supprimerLivre(3);
        System.out.println(biblio.trouverLivresParAuteur("t").size());
        System.out.println(biblio.trouverLivresParTitre("ta"));

        System.out.println(biblio.getEmprunts());
        biblio.emprunterLivre(2,new Personne("aijjou","mohamed"));
        System.out.println(biblio.getEmprunts());
        biblio.retournerLivre(2);
        System.out.println(biblio.getEmprunts());



    }
}