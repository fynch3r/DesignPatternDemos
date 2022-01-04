package com.creational.factory;

import com.creational.factory.store.ChicagoPizzaStore;
import com.creational.factory.store.NYPizzaStore;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2021-12-01 15:20
 **/


public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
