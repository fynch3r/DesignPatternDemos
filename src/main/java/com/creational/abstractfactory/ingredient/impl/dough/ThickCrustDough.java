package com.creational.abstractfactory.ingredient.impl.dough;

import com.creational.abstractfactory.ingredient.Dough;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 15:32
 **/


public class ThickCrustDough implements Dough {
    @Override
    public String toString() {
        return "ThickCrust style extra thick crust dough";
    }
}