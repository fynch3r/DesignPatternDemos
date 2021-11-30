package com.factory.impl;

import com.factory.Shape;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 16:42
 **/


public class Circle implements Shape {
    @Override
    public void banner() {
        System.out.println("Circle's banner");
    }
}
