package com.factory.abstractfactory.ingredientfactory;

import com.factory.abstractfactory.PizzaIngredientFactory;
import com.factory.abstractfactory.ingredient.*;
import com.factory.abstractfactory.ingredient.impl.cheese.ReggianoCheese;
import com.factory.abstractfactory.ingredient.impl.clams.FreshClams;
import com.factory.abstractfactory.ingredient.impl.dough.ThinCrustDough;
import com.factory.abstractfactory.ingredient.impl.pepperoni.SlicedPepperoni;
import com.factory.abstractfactory.ingredient.impl.sauce.MarinaraSauce;
import com.factory.abstractfactory.ingredient.impl.veggies.Garlic;
import com.factory.abstractfactory.ingredient.impl.veggies.Mushroom;
import com.factory.abstractfactory.ingredient.impl.veggies.Onion;
import com.factory.abstractfactory.ingredient.impl.veggies.RedPepper;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-01 15:45
 **/


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
