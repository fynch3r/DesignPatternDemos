package com.creational.factory;

import java.util.ArrayList;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2021-12-01 13:06
 **/


public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<>();


    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding souce... ");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }

    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }


}
