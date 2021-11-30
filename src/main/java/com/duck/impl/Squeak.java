package com.duck.impl;

import com.duck.QuackBehavior;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 17:54
 **/


public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squack!!");
    }
}