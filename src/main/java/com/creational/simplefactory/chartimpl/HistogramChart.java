package com.creational.simplefactory.chartimpl;

import com.creational.simplefactory.Chart;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 10:12
 **/


public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println(" Build Histogram. ");
    }

    @Override
    public void display() {
        System.out.println(" Show Histogram. ");
    }
}
