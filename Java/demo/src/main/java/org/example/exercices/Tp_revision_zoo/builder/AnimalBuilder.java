package org.example.exercices.Tp_revision_zoo.builder;

import org.example.exercices.Tp_revision_zoo.entity.Animal;

public abstract class AnimalBuilder {
    public abstract AnimalBuilder name(String name);

    public abstract Animal create();
}
