package com.behavioral.observer.jdkversion;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 09:55
 **/


public class CurrentConditionsDisplay implements Observer {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable observ, Object arg) {
        if(observ instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observ;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }


    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
