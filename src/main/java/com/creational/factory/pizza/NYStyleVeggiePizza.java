package com.creational.factory.pizza;

import com.creational.factory.Pizza;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2021-12-01 15:12
 **/

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}