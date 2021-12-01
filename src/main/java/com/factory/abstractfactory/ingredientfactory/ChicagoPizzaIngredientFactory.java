package com.factory.abstractfactory.ingredientfactory;

import com.factory.abstractfactory.PizzaIngredientFactory;
import com.factory.abstractfactory.ingredient.*;
import com.factory.abstractfactory.ingredient.impl.cheese.MozzarellaCheese;
import com.factory.abstractfactory.ingredient.impl.clams.FrozenClams;
import com.factory.abstractfactory.ingredient.impl.dough.ThickCrustDough;
import com.factory.abstractfactory.ingredient.impl.pepperoni.SlicedPepperoni;
import com.factory.abstractfactory.ingredient.impl.sauce.PlumTomatoSauce;
import com.factory.abstractfactory.ingredient.impl.veggies.BlackOlives;
import com.factory.abstractfactory.ingredient.impl.veggies.Eggplant;
import com.factory.abstractfactory.ingredient.impl.veggies.Spinach;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 15:44
 **/


public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(),
                new Spinach(),
                new Eggplant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
