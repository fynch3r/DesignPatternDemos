package com.behavioral.memento;

import java.util.ArrayList;

/**
 * @program: DesignPattern
 * @description: 备忘录管理
 * @author: fynch3r
 * @create: 2022-01-04 21:07
 **/


public class MementoCaretaker {
    // 备忘录管理
    private ArrayList<ChessmanMemento> mementolist = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return mementolist.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }

}
