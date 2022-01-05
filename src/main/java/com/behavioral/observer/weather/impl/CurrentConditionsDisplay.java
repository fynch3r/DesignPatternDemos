package com.behavioral.observer.weather.impl;

import com.behavioral.observer.weather.DisplayElement;
import com.behavioral.observer.weather.Observer;
import com.behavioral.observer.weather.Subject;

/**
 * @program: DesignPattern
 * @description: Observer
 * @author: 0range
 * @create: 2021-12-01 09:06
 **/


public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float humidity;
    private float temperature;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this); // 加入观察者列表
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
