package com.behavioral.observer.battle;

/**
 * @program: DesignPattern
 * @description: 玩家，每个玩家只能有一个对应的战队
 * @author: fynch3r
 * @create: 2022-01-05 09:11
 **/


public class Player implements Observer{
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("Hold on bro, "+this.name+" is coming!");
    }

    @Override
    public void beAttacked(AllyControlCenterTemplate acc) {
        System.out.println("Oh! "+this.name+"is being attack!");
        acc.notifyObservers(this.name);
    }
}
