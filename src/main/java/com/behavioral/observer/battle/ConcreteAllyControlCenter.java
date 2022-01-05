package com.behavioral.observer.battle;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-05 09:05
 **/


public class ConcreteAllyControlCenter extends AllyControlCenterTemplate{

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName+" team build success!");
        this.allyName = allyName;
    }

    @Override
    public void notifyObservers(String name) {
        System.out.println(this.allyName + "'s "+ name+" is being attacked!");
        // 遍历观察者集合,寻求盟友帮助
        for (Observer ob : players) {
            if(!ob.getName().equalsIgnoreCase(name)){
                ob.help();
            }
        }
    }
}
