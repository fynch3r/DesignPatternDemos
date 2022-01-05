package com.behavioral.visitor.role;

import com.behavioral.visitor.Visitor;
import com.behavioral.visitor.employee.FulltimeEmployee;
import com.behavioral.visitor.employee.ParttimeEmployee;

/**
 * @program: DesignPattern
 * @description: 人力资源部门
 * @author: fynch3r
 * @create: 2022-01-05 10:30
 **/


public class HRVistor implements Visitor {
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("FulltimeEmployee: " + employee.getName() + " 工作时间：" + workTime + ".");
        if (workTime > 40) {
            System.out.println("FulltimeEmployee: " + employee.getName() + " 加班时间：" + (workTime - 40) + ".");
        } else if (workTime < 40) {
            System.out.println("FulltimeEmployee: " + employee.getName() + " 请假时间：" + (40 - workTime) + ".");
        }
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("ParttimeEmployee: " + employee.getName() + " 工作时间：" + workTime + ".");
    }
}
