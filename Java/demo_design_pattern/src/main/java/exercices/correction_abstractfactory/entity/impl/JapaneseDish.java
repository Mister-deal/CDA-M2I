package exercices.correction_abstractfactory.entity.impl;

import exercices.correction_abstractfactory.entity.Dish;

public class JapaneseDish extends Dish {
    @Override
    protected void serve() {
        System.out.println("Japanese serve");
    }
}
