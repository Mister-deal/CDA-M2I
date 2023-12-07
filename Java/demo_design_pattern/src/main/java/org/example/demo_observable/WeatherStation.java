package org.example.demo_observable;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class WeatherStation implements Subject {

    private Random random = new Random();

    List<Observer> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void randomTemperature()  {
        notifyObservers(new Weather(random.nextDouble(-10,50)));
    }

    @Override
    public void notifyObservers(Weather weather) {
        observers.forEach(o -> o.update(weather));
    }
}
