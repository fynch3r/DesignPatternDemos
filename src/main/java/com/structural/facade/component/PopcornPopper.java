package com.structural.facade.component;

/**
 * @program: DesignPattern
 * @description: 爆米花机
 * @author: 0range
 * @create: 2021-12-01 21:26
 **/


public class PopcornPopper {
    String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void pop() {
        System.out.println(description + " popping popcorn!");
    }


    public String toString() {
        return description;
    }
}
