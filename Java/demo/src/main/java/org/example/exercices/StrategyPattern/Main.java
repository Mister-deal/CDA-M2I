package org.example.exercices.StrategyPattern;

public class Main {
    public static void main(String[] args){
        NavigationSystem navigationSystem = new NavigationSystem(new RoadStrategy());
        navigationSystem.navigateTo("city a");

        navigationSystem.setNavigationStrategy(new OffRoadStrategy());
        navigationSystem.navigateTo("mountain b");

        navigationSystem.setNavigationStrategy(new EconomicStrategy());
        navigationSystem.navigateTo("city a");
    }
}
