package com.creational.abstractfactory.store;

import com.creational.abstractfactory.Pizza;
import com.creational.abstractfactory.PizzaIngredientFactory;
import com.creational.abstractfactory.PizzaStore;
import com.creational.abstractfactory.ingredientfactory.ChicagoPizzaIngredientFactory;
import com.creational.abstractfactory.pizza.CheesePizza;
import com.creational.abstractfactory.pizza.ClamPizza;
import com.creational.abstractfactory.pizza.PepperoniPizza;
import com.creational.abstractfactory.pizza.VeggiePizza;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 16:07
 **/


public class ChicagoPizzaStore extends PizzaStore {

    @Override
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

