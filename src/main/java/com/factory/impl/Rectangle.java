package com.factory.impl;

import com.factory.Shape;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 16:41
 **/


public class Rectangle implements Shape {
    @Override
    public void banner() {
        System.out.println("Rectangle's banner");
    }
}
