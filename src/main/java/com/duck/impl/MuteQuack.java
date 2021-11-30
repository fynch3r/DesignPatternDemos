package com.duck.impl;

import com.duck.QuackBehavior;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 17:53
 **/


public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Mute >>");
    }
}
