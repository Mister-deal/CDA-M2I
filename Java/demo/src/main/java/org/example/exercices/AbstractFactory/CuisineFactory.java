package org.example.exercices.AbstractFactory;

abstract class CuisineFactory {
    abstract Ingredient createIngredient();
    abstract CookingUtensil createUtensil();
    abstract Dish createDish();
}
