package com.factory.abstractfactory.store;

import com.factory.abstractfactory.Pizza;
import com.factory.abstractfactory.PizzaIngredientFactory;
import com.factory.abstractfactory.PizzaStore;
import com.factory.abstractfactory.ingredientfactory.ChicagoPizzaIngredientFactory;
import com.factory.abstractfactory.pizza.CheesePizza;
import com.factory.abstractfactory.pizza.ClamPizza;
import com.factory.abstractfactory.pizza.PepperoniPizza;
import com.factory.abstractfactory.pizza.VeggiePizza;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 16:07
 **/


public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;

            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;

            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;

            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
        }

        return pizza;
    }
}

