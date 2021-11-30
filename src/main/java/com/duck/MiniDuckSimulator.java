package com.duck;

import com.duck.ducks.MallardDuck;
import com.duck.ducks.ModelDuck;
import com.duck.impl.FlyRocketPowered;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 17:55
 **/


public class MiniDuckSimulator {
    public static void main(String[] args) {
        //Duck mallardDuck = new MallardDuck();git pull
        //mallardDuck.performQuack();
        //mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
