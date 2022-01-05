package com.structural.flyweight.extend;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 15:59
 **/


public abstract class IgoChessman {
    public void display(Coordinates coord) {
        String str = String.format("Chess's color is %s, coordinate is (%d,%d).", this.getColor(), coord.getX(), coord.getY());
        System.out.println(str);
    }

    public abstract String getColor();
}
