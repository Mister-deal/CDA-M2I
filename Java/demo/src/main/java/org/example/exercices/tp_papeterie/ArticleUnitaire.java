package org.example.exercices.tp_papeterie;

public abstract class ArticleUnitaire extends Article{

    protected String name;
    protected double price;

    public ArticleUnitaire(int id, String name, double price) {
        super(id);
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ArticleUnitaire{" + super.toString() +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
