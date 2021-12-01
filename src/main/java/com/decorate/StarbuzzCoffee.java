package com.decorate;

import com.decorate.decorators.Soy;
import com.decorate.drinks.Expresso;
import com.decorate.drinks.HouseBlend;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 11:04
 **/


public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage expresso = new Expresso();
        System.out.println(expresso.getDescription()+" $"+expresso.cost());
        expresso = new Soy(expresso);
        System.out.println(expresso.getDescription()+" $"+expresso.cost());

        //Beverage houseBlend = new HouseBlend();
        //houseBlend = new Soy(houseBlend);
        //houseBlend = new (houseBlend);
        //houseBlend = new Soy(houseBlend);

    }
}
