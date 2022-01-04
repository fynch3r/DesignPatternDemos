package com.creational.factory.store;

import com.creational.factory.Pizza;
import com.creational.factory.PizzaStore;
import com.creational.factory.pizza.*;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
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
