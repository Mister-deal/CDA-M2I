package exercices.correction_abstractfactory.entity.impl;

import exercices.correction_abstractfactory.entity.Dish;

public class ItalianDish extends Dish {
    @Override
    protected void serve() {
        System.out.println("Italian serve");
    }
}
