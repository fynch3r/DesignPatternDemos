package com.behavioral.memento;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 21:11
 **/


public class Client {

    private static int index = -1;
    private static MementoCaretaker mc = new MementoCaretaker();

    public static void main(String[] args) {
        Chessman chess = new Chessman("car", 1, 1);
        play(chess);
        chess.setY(4);
        play(chess);
        chess.setX(5);
        play(chess);
        undo(chess,index);
        undo(chess,index);
        redo(chess,index);
        redo(chess,index);
    }
    // 下棋
    public static void play(Chessman chess) {
        mc.setMemento(chess.save()); // 保存备忘录
        index ++;
        chess.state();
    }

    // 悔棋
    public static void undo(Chessman chess,int i){
        System.out.println("*****悔棋******");
        index--;
        chess.restore(mc.getMemento(i-1));
        chess.state();
    }

    // 撤销悔棋
    public static void redo(Chessman chess,int i){
        System.out.println("******撤销悔棋******");
        index ++;
        chess.restore(mc.getMemento(i+1));
        chess.state();
    }



}
