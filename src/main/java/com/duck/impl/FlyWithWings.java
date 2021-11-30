package com.duck.impl;

import com.duck.FlyBehavior;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 17:50
 **/


public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
