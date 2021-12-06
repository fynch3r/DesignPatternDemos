package com.structural.facade.component;

/**
 * @program: DesignPattern
 * @description: 投影仪
 * @author: 0range
 * @create: 2021-12-01 21:30
 **/


public class Projector {
    String description;
    StreamingPlayer player;

    public Projector(String description, StreamingPlayer player) {
        this.description = description;
        this.player = player;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void wideScreenMode() {
        System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
    }

    public void tvMode() {
        System.out.println(description + " in tv mode (4x3 aspect ratio)");
    }

    @Override
    public String toString() {
        return description;
    }
}
