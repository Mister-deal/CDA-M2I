package exercices.correction_abstractfactory.entity.impl;

import exercices.correction_abstractfactory.entity.CookingUtensil;

public class JapaneseCookingUtensil extends CookingUtensil {
    @Override
    protected void use() {
        System.out.println("Japanese use");
    }
}
