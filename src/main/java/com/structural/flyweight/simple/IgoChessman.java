package com.structural.flyweight.simple;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 15:41
 **/


public abstract class IgoChessman {
    public void display(){
        System.out.println("Chess's color is " + this.getColor());
    }

    public abstract String getColor();

}
