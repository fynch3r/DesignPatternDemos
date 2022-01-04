package com.creational.simplefactory;

import com.creational.simplefactory.chartimpl.HistogramChart;
import com.creational.simplefactory.chartimpl.LineChart;
import com.creational.simplefactory.chartimpl.PieChart;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 10:16
 **/


public class ChartFactory {

    public static Chart getChart(String chartType){
        Chart chart = null;
        if("histogram".equalsIgnoreCase(chartType)){
            chart = new HistogramChart();
            System.out.println(" Initial one Histogram Chart. ");
        }else if("pie".equalsIgnoreCase(chartType)){
            chart = new PieChart();
            System.out.println(" Initial one Pie Chart. ");
        }else if("line".equalsIgnoreCase(chartType)){
            chart = new LineChart();
            System.out.println(" Initial one Line Chart. ");
        }
        return chart;
    }
}
