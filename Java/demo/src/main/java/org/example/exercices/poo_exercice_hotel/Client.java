package org.example.exercices.poo_exercice_hotel;

public class Client {

public static int counter = 0;

private int id;

private String surname;

private String cellphone;
private String name;

    {
        counter++;
    }

    public Client(int id) {
        this.id = counter;
    }

    public Client(String surname, String cellphone, String name) {
        this.id = counter;
        this.surname = surname;
        this.cellphone = cellphone;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + surname + " - Téléphone : " + cellphone + " id : " + id;
    }
}
