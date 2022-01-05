package com.behavioral.visitor.employee;

import com.behavioral.visitor.Employee;
import com.behavioral.visitor.Visitor;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-05 10:23
 **/


public class ParttimeEmployee implements Employee {
    private String name;
    private double hourWage;// 周薪
    private int workTime; // 每周工作时长

    public ParttimeEmployee(String name, double weeklyWage, int workTime) {
        this.name = name;
        this.hourWage = weeklyWage;
        this.workTime = workTime;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);// 访问
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourWage() {
        return hourWage;
    }

    public void setHourWage(double hourWage) {
        this.hourWage = hourWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
