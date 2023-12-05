package org.example.exercices.AbstractFactory;

class JapaneseCuisineFactory extends CuisineFactory {
    Ingredient createIngredient() {
        return new JapaneseIngredient();
    }

    CookingUtensil createUtensil() {
        return new JapaneseUtensil();
    }

    Dish createDish() {
        return new JapaneseDish();
    }
}