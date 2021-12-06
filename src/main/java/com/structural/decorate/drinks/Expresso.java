package com.structural.decorate.drinks;

import com.structural.decorate.Beverage;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 10:53
 **/


public class Expresso extends Beverage {

    public Expresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
