package com.creational.simplefactory;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 10:21
 **/


public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("pie");
        chart.display();
    }
}
