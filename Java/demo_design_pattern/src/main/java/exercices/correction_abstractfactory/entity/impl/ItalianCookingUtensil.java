package exercices.correction_abstractfactory.entity.impl;

import exercices.correction_abstractfactory.entity.CookingUtensil;

public class ItalianCookingUtensil extends CookingUtensil {
    @Override
    protected void use() {
        System.out.println("Italian use");
    }
}
