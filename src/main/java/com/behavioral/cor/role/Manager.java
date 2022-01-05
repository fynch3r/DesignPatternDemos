package com.behavioral.cor.role;

import com.behavioral.cor.Approver;
import com.behavioral.cor.PurchaseRequest;

/**
 * @program: DesignPattern
 * @description: 经理
 * @author: fynch3r
 * @create: 2022-01-04 17:46
 **/


public class Manager extends Approver {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 80000) {
            System.out.println("Manager" + this.name + "check list :" + request.getNumber() + "count: " + request.getAmount() + "goal : " + request.getPurpose());
        }
        else {
            this.successor.processRequest(request);  //ת������
        }
    }
}
