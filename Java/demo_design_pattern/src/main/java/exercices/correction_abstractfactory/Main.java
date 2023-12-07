package exercices.correction_abstractfactory;

import exercices.correction_abstractfactory.entity.Restaurant;
import exercices.correction_abstractfactory.factory.impl.ItalianCuisineFactory;
import exercices.correction_abstractfactory.factory.impl.JapaneseCuisineFactory;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(new ItalianCuisineFactory());
        restaurant.runPlate();
        restaurant.setCuisineFactory(new JapaneseCuisineFactory());
        restaurant.runPlate();
    }
}
