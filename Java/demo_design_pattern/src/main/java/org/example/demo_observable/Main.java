package org.example.demo_observable;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Phone phone = new Phone();
        Tablet tablet = new Tablet();
        weatherStation.registerObserver(phone);
        weatherStation.registerObserver(tablet);

        weatherStation.randomTemperature();

        weatherStation.randomTemperature();
        weatherStation.removeObserver(tablet);
        weatherStation.randomTemperature();
    }
}
