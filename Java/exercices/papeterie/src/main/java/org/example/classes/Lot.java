package org.example.classes;

public class Lot extends Article{

    private Article article;

    private int nb, pourcentage;

    public Lot(String reference,String referenceArticle,int nb, int pourcentage) {
        super(reference);
        this.article = Article.getArticle(referenceArticle);
        this.nb = nb;
        this.pourcentage = pourcentage;

    }


    @Override
    public String getNom() {
        return "Lot de "+nb+ " "+ article.getNom();
    }

    @Override
    public double getPU() {
        return nb * article.getPU() * (100 - pourcentage) / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " reduction : "+ pourcentage+ " compose de "+nb+ " "+ article;
    }
}
