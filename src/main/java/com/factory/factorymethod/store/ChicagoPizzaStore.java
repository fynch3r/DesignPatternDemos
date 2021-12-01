package com.factory.factorymethod.store;

import com.factory.factorymethod.Pizza;
import com.factory.factorymethod.PizzaStore;
import com.factory.factorymethod.pizza.*;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 15:18
 **/


public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
