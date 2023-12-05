package org.example.exercices.Builder;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new Pizza.Builder().pate("épaisse").sauce("tomate").build();
        System.out.println(pizza);
    }
}
