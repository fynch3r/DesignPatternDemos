package com.behavioral.cor;

import com.behavioral.cor.role.Congress;
import com.behavioral.cor.role.Director;
import com.behavioral.cor.role.President;
import com.behavioral.cor.role.VicePresident;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 17:49
 **/


public class Client {
    public static void main(String[] args) {
        Approver director,vicePresident,president,congress;
        director = new Director("主任");
        vicePresident = new VicePresident("副主席");
        president = new President("主席");
        congress = new Congress("董事会");

        //创建职责链
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);

        //创建采购单
        PurchaseRequest prA = new PurchaseRequest(45000,10001,"买");
        director.processRequest(prA);

        PurchaseRequest prB = new PurchaseRequest(60000,10002,"买买");
        director.processRequest(prB);

        PurchaseRequest prC = new PurchaseRequest(160000,10003,"买买买");
        director.processRequest(prC);

        PurchaseRequest prD = new PurchaseRequest(800000,10004,"买买买买");
        director.processRequest(prD);
    }
}
