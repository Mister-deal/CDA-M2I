package org.example.exercices.tp_papeterie;

public class Ramette extends ArticleUnitaire{

    private int weight;

    public Ramette(int id, String name, double price, int weight) {
        super(id, name, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ramette{" + super.toString() +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
