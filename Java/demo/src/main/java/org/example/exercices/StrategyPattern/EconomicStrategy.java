package org.example.exercices.StrategyPattern;

public class EconomicStrategy implements NavigationStrategy{
    @Override
    public void navigate(String destination) {
        System.out.println("calcul de l'itinéraire en mode Economic de : " + destination);
    }
}
