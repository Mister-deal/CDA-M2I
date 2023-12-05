package org.example.exercices.Builder;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new Pizza.Builder().pate("épaisse").sauce("tomate").garnitures("pepperoni").garnitures("champignons").build();
        System.out.println(pizza);
    }
}
