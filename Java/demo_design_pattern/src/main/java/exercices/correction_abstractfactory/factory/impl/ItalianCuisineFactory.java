package exercices.correction_abstractfactory.factory.impl;

import exercices.correction_abstractfactory.entity.CookingUtensil;
import exercices.correction_abstractfactory.entity.Dish;
import exercices.correction_abstractfactory.entity.Ingredient;
import exercices.correction_abstractfactory.entity.impl.ItalianCookingUtensil;
import exercices.correction_abstractfactory.entity.impl.ItalianDish;
import exercices.correction_abstractfactory.entity.impl.ItalianIngredient;
import exercices.correction_abstractfactory.factory.CuisineFactory;

public class ItalianCuisineFactory extends CuisineFactory {
    @Override
    public Ingredient createIngredient() {
        return new ItalianIngredient();
    }

    @Override
    public CookingUtensil createUtensil() {
        return new ItalianCookingUtensil();
    }

    @Override
    public Dish createDish() {
        return new ItalianDish();
    }
}
