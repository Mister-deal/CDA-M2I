package org.example.exercices.StrategyPattern;

public class OffRoadStrategy implements NavigationStrategy{
    @Override
    public void navigate(String destination) {
        System.out.println("calcul de l'itinéraire en mode offRoad de : " + destination);
    }
}
