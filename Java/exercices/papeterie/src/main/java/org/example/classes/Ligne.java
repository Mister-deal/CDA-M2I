package org.example.classes;

public class Ligne {

    private Article article;

    private int quantite;

    public Ligne(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public void afficheToi() {
        System.out.printf("%7d  | %6s | %22s  | %.2f | %.2f %n",
                quantite, article.getReference(),article.getNom(),article.getPU(),prixTotal()
                );
    }

    public double prixTotal(){
        return article.getPU()* quantite;
    }

    @Override
    public String toString() {
        return quantite + " " + article;
    }
}
