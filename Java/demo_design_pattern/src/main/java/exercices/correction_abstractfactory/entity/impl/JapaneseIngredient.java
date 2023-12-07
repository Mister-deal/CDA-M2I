package exercices.correction_abstractfactory.entity.impl;

import exercices.correction_abstractfactory.entity.Ingredient;

public class JapaneseIngredient extends Ingredient {
    @Override
    protected void prepare() {
        System.out.println("Japanese prepare");
    }
}
