package com.creational.singleton;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 12:56
 **/


public class Client {
    public static void main(String[] args) {
        LoadBalancer balancer1,balancer2,balancer3,balancer4;
        balancer1 = LoadBalancer.getInstance();
        balancer2 = LoadBalancer.getInstance();
        balancer3 = LoadBalancer.getInstance();
        balancer4 = LoadBalancer.getInstance();

        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            System.out.println("Singleton");
        }

        balancer1.addServer("Server a");
        balancer1.addServer("Server b");
        balancer1.addServer("Server c");
        balancer1.addServer("Server d");

        for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
            System.out.println("Add request to server: " + server);
        }

    }
}
