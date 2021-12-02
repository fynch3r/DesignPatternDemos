package com.state.statetype;

import com.state.GumballMachine;
import com.state.State;

/**
 * @program: DesignPattern
 * @description: 投完钱状态
 * @author: 0range
 * @create: 2021-12-02 11:21
 **/


public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}

