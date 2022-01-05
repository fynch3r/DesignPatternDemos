package com.behavioral.visitor;

import java.util.ArrayList;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-05 10:45
 **/


public class EmployeeList {
    private ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee) {
        this.list.add(employee);
    }

    public void accept(Visitor visitor) {
        for (Employee employee : list) {
            employee.accept(visitor);
        }
    }

}
