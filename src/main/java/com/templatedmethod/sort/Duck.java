package com.templatedmethod.sort;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-02 10:18
 **/


public class Duck implements Comparable<Duck>{
    public String name;
    public int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Duck otherDuck) {
        if(this.weight>otherDuck.weight){
            return 1;
        }else if(this.weight == otherDuck.weight){
            return 0;
        }else{
            return -1;
        }

    }
}
