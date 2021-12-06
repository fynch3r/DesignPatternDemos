package com.structural.decorate.decorators;

import com.structural.decorate.Beverage;
import com.structural.decorate.CondimentDecorator;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 11:02
 **/


public class Soy extends CondimentDecorator {
    public Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.66+ beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
}
