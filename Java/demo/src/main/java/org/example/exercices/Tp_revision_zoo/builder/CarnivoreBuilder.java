package org.example.exercices.Tp_revision_zoo.builder;

import org.example.exercices.Tp_revision_zoo.entity.Animal;
import org.example.exercices.Tp_revision_zoo.entity.Carnivore;

public class CarnivoreBuilder extends AnimalBuilder{

    private String name;

    public String getName() {
        return name;
    }


    @Override
    public AnimalBuilder name(String name) {
        return null;
    }

    @Override
    public Animal create() {
        return new Carnivore(this);
    }
}
