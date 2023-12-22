package org.example.exercices.Tp_revision_zoo.factory;

import org.example.exercices.Tp_revision_zoo.builder.AnimalBuilder;
import org.example.exercices.Tp_revision_zoo.entity.Animal;

public class CarnivoreFactory extends AnimalFactory{
    @Override
    Animal createAnimal(AnimalBuilder builder) {
        return builder.create();
    }
}
