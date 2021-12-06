package com.creational.abstractfactory;

import com.creational.abstractfactory.ingredient.*;

public interface PizzaIngredientFactory {

    // Pizza原料加工厂
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
