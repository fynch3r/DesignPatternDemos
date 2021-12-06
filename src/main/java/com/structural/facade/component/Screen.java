package com.structural.facade.component;

/**
 * @program: DesignPattern
 * @description: 屏幕
 * @author: 0range
 * @create: 2021-12-01 21:31
 **/


public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + " going up");
    }

    public void down() {
        System.out.println(description + " going down");
    }


    @Override
    public String toString() {
        return description;
    }
}
