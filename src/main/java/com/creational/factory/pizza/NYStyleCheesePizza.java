package com.creational.factory.pizza;

import com.creational.factory.Pizza;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2021-12-01 13:19
 **/


public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinare Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
