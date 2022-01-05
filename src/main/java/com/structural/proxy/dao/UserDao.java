package com.structural.proxy.dao;

import com.structural.proxy.AbstractUserDao;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 16:29
 **/


public class UserDao implements AbstractUserDao {
    @Override
    public Boolean findUserById(String userId) {
        if("tommy".equalsIgnoreCase(userId)){
            System.out.println("Success. ");
            return true;
        }else{
            System.out.println("Failed. ");
            return false;
        }
    }
}
