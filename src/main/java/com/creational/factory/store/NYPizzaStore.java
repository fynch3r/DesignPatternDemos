package com.creational.factory.store;

import com.creational.factory.Pizza;
import com.creational.factory.PizzaStore;
import com.creational.factory.pizza.*;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2021-12-01 15:15
 **/


public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
