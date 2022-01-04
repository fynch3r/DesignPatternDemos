package com.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 12:48
 **/


public class LoadBalancer {
    private static LoadBalancer instance = null;

    private List<Object> serverList;

    private LoadBalancer() {
        serverList = new ArrayList<>();
    }

    public static LoadBalancer getInstance() {
        if(instance == null){
            instance = new LoadBalancer();
        }
        return instance;
    }


    public void addServer(String server){
        serverList.add(server);
    }

    public void removeServer(String server){
        serverList.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }

}
