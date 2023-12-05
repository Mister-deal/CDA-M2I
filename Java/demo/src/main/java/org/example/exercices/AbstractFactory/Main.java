package org.example.exercices.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        CuisineFactory italianFactory = new ItalianCuisineFactory();
        CuisineFactory japaneseFactory = new JapaneseCuisineFactory();
        CuisineFactory mexicanFactory = new MexicanCuisineFactory();

        Restaurant italianRestaurant = new Restaurant(italianFactory);
        Restaurant japaneseRestaurant = new Restaurant(japaneseFactory);
        Restaurant mexicanRestaurant = new Restaurant(mexicanFactory);

        System.out.println("Italian Cuisine:");
        italianRestaurant.prepareDish();

        System.out.println("\nJapanese Cuisine:");
        japaneseRestaurant.prepareDish();

        System.out.println("\nMexican Cuisine:");
        mexicanRestaurant.prepareDish();
    }
}
