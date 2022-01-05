package com.structural.flyweight.extend;

/**
 * @program: DesignPattern
 * @description: 坐标类，表示棋子的不同坐标
 * @author: fynch3r
 * @create: 2022-01-04 16:02
 **/


public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
