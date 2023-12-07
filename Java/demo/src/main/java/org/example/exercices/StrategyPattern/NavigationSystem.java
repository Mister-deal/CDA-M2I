package org.example.exercices.StrategyPattern;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NavigationSystem {

    private NavigationStrategy navigationStrategy;

    public NavigationSystem(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void setNavigationStrategy(NavigationStrategy strategy) {
        this.navigationStrategy = strategy;
    }

    public void navigateTo(String destination){
        if(navigationStrategy != null){
            navigationStrategy.navigate(destination);
        }else {
            System.out.println("veuillez entrer une stratégie de navigation avant");
        }
    }
}
