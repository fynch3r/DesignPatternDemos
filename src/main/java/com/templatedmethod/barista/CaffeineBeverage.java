package com.templatedmethod.barista;

/**
 * @program: DesignPattern
 * @description: 一切咖啡因类饮料：咖啡，茶...
 * @author: 0range
 * @create: 2021-12-02 09:25
 **/


public abstract class CaffeineBeverage {
    // 模板方法
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }


    public final void boilWater() {
        System.out.println("Boiling water!");
    }

    public abstract void brew();

    public final void pourInCup() {
        System.out.println("Pouring into cup!");
    }

    public abstract void addCondiments();


}
