package com.creational.abstractfactory.ingredient.impl.cheese;

import com.creational.abstractfactory.ingredient.Cheese;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 15:29
 **/

public class MozzarellaCheese implements Cheese {

    @Override
    public String toString() {
        return "Shredded Mozzarella";
    }
}
