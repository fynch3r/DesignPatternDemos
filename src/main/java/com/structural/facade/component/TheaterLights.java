package com.structural.facade.component;

/**
 * @program: DesignPattern
 * @description: 灯光
 * @author: 0range
 * @create: 2021-12-01 21:31
 **/


public class TheaterLights {
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void dim(int level) {
        System.out.println(description + " dimming to " + level  + "%");
    }

    @Override
    public String toString() {
        return description;
    }
}
