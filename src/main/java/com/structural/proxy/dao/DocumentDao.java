package com.structural.proxy.dao;

import com.structural.proxy.AbstractDocumentDao;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 16:31
 **/


public class DocumentDao implements AbstractDocumentDao {
    @Override
    public Boolean deleteDocumentById(String documentId) {
        if ("D001".equalsIgnoreCase(documentId)) {
            System.out.println("Success. ");
            return true;
        }
        else {
            System.out.println("Failed. ");
            return false;
        }
    }
}
