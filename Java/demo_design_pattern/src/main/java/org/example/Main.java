package org.example;

import exercices.correction_exercice_builder.Pizza;
import org.example.demo_abstractfactory.Application;
import org.example.demo_abstractfactory.MacFactory;
import org.example.demo_abstractfactory.WinFactory;
import org.example.demo_builder.Person;
import org.example.demo_builder.Voiture;
import org.example.demo_singleton.Storage;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Voiture voiture = new Voiture.Builder()
                .marque("tesla")
                .model("3").build();
        System.out.println(voiture);
        voiture = new Voiture.Builder().marque("m1")
                .build();
        System.out.println(voiture);

        Pizza pizza = new Pizza.Builder()
                .garnitures("g1").garnitures("g2")
                .taille("taille 1")
                .fromage("f1")
                .build();
        System.out.println(pizza);

        //Person p = new Person.PersonBuilder().lastname("toto").firstname("titi").build();

        //Utilisation de la reflexion
        //Class<?> classPerson = Class.forName("org.example.demo_builder.Person");

        //Abstract Factory

        //ApplicationMac
        Application applicationMac = new Application(new MacFactory());
        //ApplicationWindows
        Application applicationWindows = new Application(new WinFactory());

        //Utilisation du singleton
        List<Person> liste =  Storage.getInstance().getPersonList();
        liste = Storage.getInstance().getPersonList();
        }
    }
