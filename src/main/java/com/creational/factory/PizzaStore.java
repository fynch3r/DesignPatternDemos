package com.creational.factory;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2021-12-01 13:04
 **/


public abstract class PizzaStore {

    public Pizza orderPizza(String type){

        // 工厂方法,隐藏
        Pizza pizza = this.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }


    public abstract Pizza createPizza(String type);


}
