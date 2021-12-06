package com.behavioral.strategy.duck.ducks;

import com.behavioral.strategy.duck.Duck;
import com.behavioral.strategy.duck.impl.FlyWithWings;
import com.behavioral.strategy.duck.impl.Quack;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 17:57
 **/


public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'");
    }

    @Override
    public void performFly() {
        super.performFly();
    }

    @Override
    public void performQuack() {
        super.performQuack();
    }

    @Override
    public void swim() {
        super.swim();
    }
}
