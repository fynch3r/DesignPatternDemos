package com.creational.abstractfactory.ingredient.impl.clams;

import com.creational.abstractfactory.ingredient.Clams;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 15:31
 **/

public class FreshClams implements Clams {

    @Override
    public String toString() {
        return "Fresh Clams from Long Island Sound";
    }
}