package com.behavioral.memento;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 21:05
 **/


public class Chessman {
    private String label;
    private int x;
    private int y;

    public Chessman(String label,int x,int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getLabel() {
        return (this.label);
    }

    public int getX() {
        return (this.x);
    }

    public int getY() {
        return (this.y);
    }

    // 保存状态
    public ChessmanMemento save() {
        return new ChessmanMemento(this.label,this.x,this.y);
    }

    // 恢复状态
    public void restore(ChessmanMemento memento) {
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    // 打印状态
    public void state(){
        System.out.println("棋子" + this.getLabel() + "当前位置：" + "第" + this.getX() + "行" + "第" + this.getY() + "列");
    }


}
