package com.creational.abstractfactory.ingredient.impl.sauce;

import com.creational.abstractfactory.ingredient.Sauce;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 15:34
 **/

public class PlumTomatoSauce implements Sauce {
    @Override
    public String toString() {
        return "Tomato sauce with plum tomatoes";
    }
}