package org.example.exercices.Tp_revision_zoo.factory;

import org.example.exercices.Tp_revision_zoo.builder.AnimalBuilder;
import org.example.exercices.Tp_revision_zoo.entity.Animal;

public abstract class AnimalFactory {
    abstract Animal createAnimal(AnimalBuilder builder);
}
