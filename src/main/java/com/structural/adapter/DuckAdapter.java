package com.structural.adapter;

/**
 * @program: DesignPattern
 * @description: 将duck伪装为turkey
 * @author: 0range
 * @create: 2021-12-01 20:36
 **/


public class DuckAdapter implements Turkey{

    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {

    }
}
