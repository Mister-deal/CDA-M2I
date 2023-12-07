package exercices.correction_abstractfactory.factory;

import exercices.correction_abstractfactory.entity.CookingUtensil;
import exercices.correction_abstractfactory.entity.Dish;
import exercices.correction_abstractfactory.entity.Ingredient;

public abstract class CuisineFactory {
    public abstract Ingredient createIngredient();
    public abstract CookingUtensil createUtensil();
    public abstract Dish createDish();
}
