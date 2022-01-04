package com.creational.singleton.type;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 13:01
 **/


public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}
