package org.example.exercices.AbstractFactory;

class MexicanCuisineFactory extends CuisineFactory {
    Ingredient createIngredient() {
        return new MexicanIngredient();
    }

    CookingUtensil createUtensil() {
        return new MexicanUtensil();
    }

    Dish createDish() {
        return new MexicanDish();
    }
}