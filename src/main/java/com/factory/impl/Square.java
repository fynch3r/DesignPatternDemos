package com.factory.impl;

import com.factory.Shape;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-11-30 16:40
 **/


public class Square implements Shape {
    @Override
    public void banner() {
        System.out.println("Square's square");
    }
}
