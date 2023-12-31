package org.example.poo.statics;

public class User {
    public static final String DEFAUlT_USER_GROUP = "customers";

    public static int counter = 0;

    protected int id;
    protected String name;

    {
        counter++;
    }

    public User() {
        this.id = counter;
    }


    public User( String name) {
        this.id = counter++;
        this.name = name;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
