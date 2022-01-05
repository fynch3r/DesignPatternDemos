package com.behavioral.visitor;

import com.behavioral.visitor.employee.FulltimeEmployee;
import com.behavioral.visitor.employee.ParttimeEmployee;
import com.behavioral.visitor.role.FAVistor;
import com.behavioral.visitor.role.HRVistor;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-05 10:50
 **/


public class Client {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        Employee fte1,fte2,fte3,pte1,pte2;

        fte1 = new FulltimeEmployee("fulltime1",3200.00,45);
        fte2 = new FulltimeEmployee("fulltime2",2000.00,40);
        fte3 = new FulltimeEmployee("fulltime3",2400.00,38);
        pte1 = new ParttimeEmployee("parttime1",80.00,20);
        pte2 = new ParttimeEmployee("parttime2",60.00,18);

        list.addEmployee(fte1);
        list.addEmployee(fte2);
        list.addEmployee(fte3);
        list.addEmployee(pte1);
        list.addEmployee(pte2);

        Visitor faVisitor = new FAVistor();
        list.accept(faVisitor);

        Visitor hrVisitor = new HRVistor();
        list.accept(hrVisitor);

    }
}
