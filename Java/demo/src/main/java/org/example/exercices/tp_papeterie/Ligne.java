package org.example.exercices.tp_papeterie;

public class Ligne{
    private Article articles;
    private int quantite;

    public Ligne(Article articles, int quantite) {
        this.articles = articles;
        this.quantite = quantite;
    }

    public void afficheLigne(){
        System.out.println(
                "Quantité: " + quantite +
                        " - Référence de l'article: " + articles.getId() +
                        " article " + articles +
                        " - Prix total: " + getPrixTotal()
        );
    }
    public double getPrixTotal() {
        // Calculez le prix total en fonction de la quantité et du prix unitaire de l'article
        //return quantite * this.articles;
    }

    public Article getArticles() {
        return articles;
    }

    public void setArticles(Article articles) {
        this.articles = articles;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantité(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Ligne{" + super.toString() +
                "articles=" + articles +
                ", quantité=" + quantite +
                '}';
    }
}
