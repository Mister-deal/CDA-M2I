package org.example.demo_builder;

public class Voiture {
    private String marque;
    private String model;
    private int annee;
    private double prix;

    private Voiture(Builder builder) {
        this.marque = builder.marque;
        this.model = builder.model;
        this.prix = builder.prix;
        this.annee = builder.annee;
    }

    public  static class Builder {
        private String marque;
        private String model;
        private int annee;
        private double prix;

        public Builder marque(String marque) {
            this.marque = marque;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }
        public Builder annee(int annee) {
            this.annee = annee;
            return this;
        }
        public Builder prix(double prix) {
            this.prix = prix;
            return this;
        }

        public Voiture build() {
            return new Voiture(this);
        }
    }
}
