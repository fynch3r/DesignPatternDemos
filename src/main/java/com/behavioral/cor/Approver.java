package com.behavioral.cor;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 17:39
 **/


public abstract class Approver {

    protected String name; //审批者姓名
    protected Approver successor; //后继对象

    public Approver(String name) {
        this.name = name;
    }


    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }


    public abstract void processRequest(PurchaseRequest request);
}
