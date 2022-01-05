package com.behavioral.cor.role;

import com.behavioral.cor.Approver;
import com.behavioral.cor.PurchaseRequest;

/**
 * @program: DesignPattern
 * @description: 董事长
 * @author: fynch3r
 * @create: 2022-01-04 17:47
 **/


public class President extends Approver {

    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000) {
            System.out.println("President" + this.name + "check list :" + request.getNumber() + "count: " + request.getAmount() + "goal : " + request.getPurpose());
        }
        else {
            this.successor.processRequest(request);  //ת������
        }
    }
}
