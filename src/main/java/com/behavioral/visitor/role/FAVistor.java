package com.behavioral.visitor.role;

import com.behavioral.visitor.Visitor;
import com.behavioral.visitor.employee.FulltimeEmployee;
import com.behavioral.visitor.employee.ParttimeEmployee;

/**
 * @program: DesignPattern
 * @description: 财务部门
 * @author: fynch3r
 * @create: 2022-01-05 10:26
 **/


public class FAVistor implements Visitor {
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double weekWage = employee.getWeeklyWage();
        if(workTime > 40) {
            weekWage = weekWage + (workTime - 40) * 100;
        }
        else if(workTime < 40) {
            weekWage = weekWage - (40 - workTime) * 80;
            if(weekWage < 0) {
                weekWage = 0;
            }
        }
        System.out.println("FulltimeEmployee: " + employee.getName() + "'s salary is: " + weekWage + ".");
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println("ParttimeEmployee: " + employee.getName() + "'s salary is: " + workTime * hourWage + ".");
    }
}
