package com.behavioral.cor.role;

import com.behavioral.cor.Approver;
import com.behavioral.cor.PurchaseRequest;

/**
 * @program: DesignPattern
 * @description: 副董事长
 * @author: fynch3r
 * @create: 2022-01-04 17:48
 **/


public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("VicePresident" + this.name + "check list :" + request.getNumber() + "count: " + request.getAmount() + "goal : " + request.getPurpose());
        }
        else {
            this.successor.processRequest(request);  //ת������
        }
    }
}
