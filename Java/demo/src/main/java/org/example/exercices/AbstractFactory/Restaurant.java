package org.example.exercices.AbstractFactory;

public class Restaurant {
    private CuisineFactory factory;

    public Restaurant(CuisineFactory factory) {
        this.factory = factory;
    }

    public void prepareDish() {
        Ingredient ingredient = factory.createIngredient();
        CookingUtensil utensil = factory.createUtensil();
        Dish dish = factory.createDish();

        ingredient.prepare();
        utensil.use();
        dish.serve();
    }
}