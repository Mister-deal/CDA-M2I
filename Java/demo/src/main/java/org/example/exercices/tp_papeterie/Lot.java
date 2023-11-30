package org.example.exercices.tp_papeterie;

public class Lot extends Article{

    private Article articles;
    private  int quantite;
    private double  remise;

    public Lot(int id, Article articles, int quantite, double remise) {
        super(id);
        this.articles = articles;
        this.quantite = quantite;
        this.remise = remise;
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

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
