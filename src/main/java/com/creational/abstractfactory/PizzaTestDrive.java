package com.creational.abstractfactory;

import com.creational.abstractfactory.store.ChicagoPizzaStore;
import com.creational.abstractfactory.store.NYPizzaStore;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 16:09
 **/


public class PizzaTestDrive {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza cheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + cheesePizza + "\n");


        Pizza veggiePizza = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + veggiePizza + "\n");

    }
}
