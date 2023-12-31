package exercices.correction_abstractfactory.entity;

import exercices.correction_abstractfactory.factory.CuisineFactory;

public class Restaurant {
    private Ingredient ingredient;
    private Dish dish;
    private CookingUtensil cookingUtensil;

    private CuisineFactory cuisineFactory;

    public Restaurant(CuisineFactory cuisineFactory) {
        setCuisineFactory(cuisineFactory);
    }

    public void setCuisineFactory(CuisineFactory cuisineFactory) {
        this.cuisineFactory = cuisineFactory;
        ingredient = this.cuisineFactory.createIngredient();
        dish = this.cuisineFactory.createDish();
        cookingUtensil = this.cuisineFactory.createUtensil();
    }

    public void runPlate() {
        ingredient.prepare();
        cookingUtensil.use();
        dish.serve();
    }
}
