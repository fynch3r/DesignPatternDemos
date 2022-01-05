package com.behavioral.observer.battle;

import java.util.ArrayList;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-05 08:58
 **/

//指挥部
public abstract class AllyControlCenterTemplate {
    protected String allyName; //战队名称
    protected ArrayList<Observer> players = new ArrayList<>();

    // 注册战队
    public void join(Observer ob){
        System.out.println(ob.getName()+" join team "+this.allyName+" !");
        players.add(ob);
    }

    // 退出战队
    public void quit(Observer ob){
        System.out.println(ob.getName()+" quit team "+this.allyName+" !");
        players.remove(ob);
    }

    // 通知战队成员
    public abstract void notifyObservers(String name);




    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }
}
