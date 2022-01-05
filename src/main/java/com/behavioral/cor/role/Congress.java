package com.behavioral.cor.role;

import com.behavioral.cor.Approver;
import com.behavioral.cor.PurchaseRequest;

/**
 * @program: DesignPattern
 * @description: 董事会
 * @author: fynch3r
 * @create: 2022-01-04 17:44
 **/


public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("Congress" + this.name + "check list :" + request.getNumber() + "count: " + request.getAmount() + "goal : " + request.getPurpose());
    }
}
