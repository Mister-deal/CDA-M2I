package org.example.exercices.tp_interface_fonctionnelle;

@FunctionalInterface
interface CritereFiltrage{
    boolean test(Produit produit);
}
