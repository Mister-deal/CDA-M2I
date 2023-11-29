package org.example.exercices.tp_papeterie;

public class Stylo extends ArticleUnitaire  {

    private String color;

    public Stylo(int id, String name, double price, String color) {
        super(id, name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
