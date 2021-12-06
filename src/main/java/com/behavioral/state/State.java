package com.behavioral.state;

public interface State {

    public void insertQuarter();
    public void ejectQuarter();

    public void turnCrank();//转动扳手
    public void dispense(); // 发糖

    public void refill();
}
