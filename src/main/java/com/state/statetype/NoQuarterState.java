package com.state.statetype;

import com.state.GumballMachine;
import com.state.State;

/**
 * @program: DesignPattern
 * @description: 还没有投入钱
 * @author: 0range
 * @create: 2021-12-02 11:21
 **/

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill() { }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}