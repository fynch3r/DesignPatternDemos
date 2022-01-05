package com.structural.flyweight.extend;





import java.util.Hashtable;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 15:59
 **/


public class IgoChessmanFactory {
    private static Hashtable table; // 享元池

    private IgoChessmanFactory(){
        table = new Hashtable();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();
        table.put("black",black);
        table.put("white",white);
    }

    private static class InnerClass{
        private static final IgoChessmanFactory instance = new IgoChessmanFactory();
    }

    public static IgoChessmanFactory getInstance(){
        return InnerClass.instance;
    }

    public  IgoChessman getIgoChessman(String color) {
        return (IgoChessman) table.get(color);
    }
}
