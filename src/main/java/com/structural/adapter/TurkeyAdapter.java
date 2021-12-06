package com.structural.adapter;

/**
 * @program: DesignPattern
 * @description: 将火鸡伪装成鸭子，implements谁 就是伪装成谁
 * @author: 0range
 * @create: 2021-12-01 20:24
 **/


public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
