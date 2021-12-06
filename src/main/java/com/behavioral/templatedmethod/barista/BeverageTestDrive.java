package com.behavioral.templatedmethod.barista;

import com.behavioral.templatedmethod.barista.drink.Coffee;
import com.behavioral.templatedmethod.barista.drink.Tea;
import com.behavioral.templatedmethod.barista.hook.CoffeeWithHook;
import com.behavioral.templatedmethod.barista.hook.TeaWithHook;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-02 09:46
 **/


public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
