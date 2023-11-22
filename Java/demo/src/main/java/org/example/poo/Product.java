package org.example.poo;

public class Product {

    protected int id;
    protected String name;

    public Product() {
    }
    public Product(int newID) {
        id = newID;
    }
    public Product(int newID, String name) {
        id = newID;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void getBonjour(){
        System.out.println("Bonjour");
    }

    public void quiSuisJe(){
        System.out.println("Je suis un produit ");
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
