package com.behavioral.observer.battle;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-05 09:15
 **/


public class Client {
    public static void main(String[] args) {
        AllyControlCenterTemplate acc;
        Observer player1,player2,player3,player4;


        acc = new ConcreteAllyControlCenter("TeamA");
        player1 = new Player("player1");
        player2 = new Player("player2");
        player3 = new Player("player3");
        player4 = new Player("player4");

        acc.join(player1);
        acc.join(player2);
        acc.join(player3);
        acc.join(player4);

        // 1号玩家被攻击
        player1.beAttacked(acc);
    }
}
