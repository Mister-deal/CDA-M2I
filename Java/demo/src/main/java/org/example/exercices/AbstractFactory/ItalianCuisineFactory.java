package org.example.exercices.AbstractFactory;

class ItalianCuisineFactory extends CuisineFactory {
    Ingredient createIngredient() {
        return new ItalianIngredient();
    }

    CookingUtensil createUtensil() {
        return new ItalianUtensil();
    }

    Dish createDish() {
        return new ItalianDish();
    }
}