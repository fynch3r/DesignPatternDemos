package com.behavioral.strategy.duck.ducks;

import com.behavioral.strategy.duck.Duck;
import com.behavioral.strategy.duck.impl.FlyNoWay;
import com.behavioral.strategy.duck.impl.Quack;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 21:00
 **/


public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
