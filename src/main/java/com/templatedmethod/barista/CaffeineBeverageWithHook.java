package com.templatedmethod.barista;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-02 09:58
 **/


public abstract class CaffeineBeverageWithHook {
    // 模板方法
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }


    public final void boilWater() {
        System.out.println("Boiling water!");
    }

    public abstract void brew();

    public final void pourInCup() {
        System.out.println("Pouring into cup!");
    }

    public abstract void addCondiments();


    public boolean customerWantsCondiments(){
        return true;
    }
}
