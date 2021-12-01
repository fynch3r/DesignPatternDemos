package com.factory.factorymethod.store;

import com.factory.factorymethod.Pizza;
import com.factory.factorymethod.PizzaStore;
import com.factory.factorymethod.pizza.*;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
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
