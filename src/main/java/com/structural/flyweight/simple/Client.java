package com.structural.flyweight.simple;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 15:41
 **/


public class Client {
    public static void main(String[] args) {
        IgoChessman black1,black2,white1,white2;
        IgoChessmanFactory factory;

        factory = IgoChessmanFactory.getInstance();

        black1 = factory.getIgoChessman("black");
        black2 = factory.getIgoChessman("black");

        white1 = factory.getIgoChessman("white");
        white2 = factory.getIgoChessman("white");

        //System.out.println(black1 == black2);//true;
        //System.out.println(white1 == white2);//true;

        black1.display();
        black2.display();
        white1.display();
        white2.display();





    }
}
