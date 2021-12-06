package com.behavioral.strategy.duck;

import com.behavioral.strategy.duck.ducks.MallardDuck;
import com.behavioral.strategy.duck.ducks.ModelDuck;
import com.behavioral.strategy.duck.impl.FlyRocketPowered;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 17:55
 **/


public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
