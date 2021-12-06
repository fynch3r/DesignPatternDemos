package com.creational.abstractfactory.ingredient.impl.clams;

import com.creational.abstractfactory.ingredient.Clams;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 15:32
 **/

public class FrozenClams implements Clams {

    @Override
    public String toString() {
        return "Frozen Clams from Chesapeake Bay";
    }
}