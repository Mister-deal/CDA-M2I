package exercices.correction_abstractfactory.factory.impl;

import exercices.correction_abstractfactory.entity.CookingUtensil;
import exercices.correction_abstractfactory.entity.Dish;
import exercices.correction_abstractfactory.entity.Ingredient;
import exercices.correction_abstractfactory.entity.impl.JapaneseCookingUtensil;
import exercices.correction_abstractfactory.entity.impl.JapaneseDish;
import exercices.correction_abstractfactory.entity.impl.JapaneseIngredient;
import exercices.correction_abstractfactory.factory.CuisineFactory;

public class JapaneseCuisineFactory extends CuisineFactory {
    @Override
    public Ingredient createIngredient() {
        return new JapaneseIngredient();
    }

    @Override
    public CookingUtensil createUtensil() {
        return new JapaneseCookingUtensil();
    }

    @Override
    public Dish createDish() {
        return new JapaneseDish();
    }
}
