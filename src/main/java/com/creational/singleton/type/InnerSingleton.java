package com.creational.singleton.type;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 13:15
 **/


public class InnerSingleton {
    private InnerSingleton(){}

    private static class HolderClass{
        private final static InnerSingleton instance = new InnerSingleton();
    }

    private static InnerSingleton getInstance(){
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        InnerSingleton s1,s2;
        s1 = InnerSingleton.getInstance();
        s2 = InnerSingleton.getInstance();
        System.out.println(s1==s2);//true
    }
}
