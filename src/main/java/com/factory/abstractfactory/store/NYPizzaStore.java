package com.factory.abstractfactory.store;

import com.factory.abstractfactory.Pizza;
import com.factory.abstractfactory.PizzaIngredientFactory;
import com.factory.abstractfactory.PizzaStore;
import com.factory.abstractfactory.ingredientfactory.NYPizzaIngredientFactory;
import com.factory.abstractfactory.pizza.CheesePizza;
import com.factory.abstractfactory.pizza.ClamPizza;
import com.factory.abstractfactory.pizza.PepperoniPizza;
import com.factory.abstractfactory.pizza.VeggiePizza;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 16:03
 **/


public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;

            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;

            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;

            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
        }

        return pizza;
    }
}
