package com.structural.decorate;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 10:50
 **/


public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
