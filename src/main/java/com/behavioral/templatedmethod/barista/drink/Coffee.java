package com.behavioral.templatedmethod.barista.drink;

import com.behavioral.templatedmethod.barista.CaffeineBeverage;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-02 09:32
 **/


public class Coffee extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
