package com.creational.singleton.type;

/**
 * @program: DesignPattern
 * @description: double-checking
 * @author: fynch3r
 * @create: 2022-01-04 13:04
 **/


public class LazySingleton {
    private volatile static LazySingleton instance = null;
    private LazySingleton(){}

    synchronized public static LazySingleton getInstance(){
        if(instance == null){
            synchronized(LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }

        return instance;

    }
}
