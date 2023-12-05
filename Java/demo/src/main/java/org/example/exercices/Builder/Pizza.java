package org.example.exercices.Builder;

import java.util.List;

public class Pizza {

    private int taille;

    private String pate;
    private String fromage;
    private List<String> garnitures;
    private String sauce;


    private Pizza(Builder builder) {
        this.taille = builder.taille;
        this.pate = builder.pate;
        this.fromage = builder.fromage;
        this.garnitures = builder.garnitures;
        this.sauce = builder.sauce;
    }

    public static class Builder {
        private int taille;
        private String pate;
        private String fromage;
        private List<String> garnitures;
        private String sauce;

        public Builder taille(int taille) {
            this.taille = taille;
            return this;
        }

        public Builder pate(String pate) {
            this.pate = pate;
            return this;
        }

        public Builder fromage(String fromage) {
            this.fromage = fromage;
            return this;
        }

        public Builder garnitures(List<String> garnitures) {
            this.garnitures = garnitures;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "taille=" + taille +
                ", pate='" + pate + '\'' +
                ", fromage='" + fromage + '\'' +
                ", garnitures='" + garnitures + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
