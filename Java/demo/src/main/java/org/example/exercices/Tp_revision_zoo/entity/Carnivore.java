package org.example.exercices.Tp_revision_zoo.entity;

import org.example.exercices.Tp_revision_zoo.builder.CarnivoreBuilder;

public class Carnivore extends Animal{

    private String name;

    public Carnivore(CarnivoreBuilder builder) {
        name = builder.getName();
    }
}
