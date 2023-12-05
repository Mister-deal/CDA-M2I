package org.example.exercices.tp_interface_fonctionnelle;

public class Produit {
    private String nom;
    private Double prix;
    private String categorie;

    public Produit(String nom, Double prix, String categorie) {
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", categorie='" + categorie + '\'' +
                '}';
    }

}
