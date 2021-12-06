package com.structural.decorate.decorators;

import com.structural.decorate.Beverage;
import com.structural.decorate.CondimentDecorator;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 10:59
 **/


public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage + ", Mocha";
    }


    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
