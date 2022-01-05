package com.behavioral.cor.role;

import com.behavioral.cor.Approver;
import com.behavioral.cor.PurchaseRequest;

/**
 * @program: DesignPattern
 * @description: 主任
 * @author: fynch3r
 * @create: 2022-01-04 17:41
 **/


public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("Director" + this.name + "check list :" + request.getNumber() + "count: " + request.getAmount() + "goal : " + request.getPurpose());
        }
        else {
            this.successor.processRequest(request);  //交给后继者
        }
    }
}
