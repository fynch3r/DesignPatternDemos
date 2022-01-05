package com.behavioral.observer.battle;

public interface Observer {
    public String getName();
    public void setName(String name);
    public void help(); //支援
    public void beAttacked(AllyControlCenterTemplate acc); //遭受攻击
}
