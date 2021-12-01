package com.factory.factorymethod;

import com.factory.factorymethod.Pizza;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 13:04
 **/


public abstract class PizzaStore {

    public Pizza orderPizza(String type){

        // 工厂方法
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }


    public abstract Pizza createPizza(String type);


}
