package org.example.poo;

public class Phone extends Product{
    int prix;
    public Phone() {

    }

    public Phone(int newID, String name, int prix) {
        super(newID, name);
        this.prix = prix;
    }

    public Phone(int newID) {
        super(newID);
    }

    

}
