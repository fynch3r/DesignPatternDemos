package com.creational.abstractfactory;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 16:01
 **/


public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = this.createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
