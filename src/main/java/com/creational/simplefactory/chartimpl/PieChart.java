package com.creational.simplefactory.chartimpl;

import com.creational.simplefactory.Chart;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 10:14
 **/


public class PieChart implements Chart {
    public PieChart() {
        System.out.println(" Build PirChart. ");
    }

    @Override
    public void display() {
        System.out.println(" Show PieChart. ");
    }
}
