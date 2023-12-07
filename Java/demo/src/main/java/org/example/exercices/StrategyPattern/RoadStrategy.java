package org.example.exercices.StrategyPattern;

public class RoadStrategy implements NavigationStrategy{
    @Override
    public void navigate(String destination) {
        System.out.println("calcul de l'itinéraire en mode Road de : " + destination);
    }
}
