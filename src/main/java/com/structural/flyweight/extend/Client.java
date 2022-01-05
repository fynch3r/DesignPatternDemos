package com.structural.flyweight.extend;



/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 16:05
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

        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(3,4));
        white1.display(new Coordinates(2,5));
        white2.display(new Coordinates(3,5));
    }
}
