package com.creational.simplefactory.chartimpl;

import com.creational.simplefactory.Chart;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 10:15
 **/


public class LineChart implements Chart {
    public LineChart() {
        System.out.println(" Build LineChart. ");
    }

    @Override
    public void display() {
        System.out.println(" Show LineChart. ");
    }
}

