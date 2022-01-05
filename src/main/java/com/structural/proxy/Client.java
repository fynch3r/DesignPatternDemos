package com.structural.proxy;

import com.structural.proxy.dao.DocumentDao;
import com.structural.proxy.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 16:37
 **/


public class Client {
    public static void main(String[] args) {
        AbstractUserDao userDao = new UserDao();
        AbstractDocumentDao documentDao = new DocumentDao();

        InvocationHandler handlerA = null;
        InvocationHandler handlerB = null;
        AbstractUserDao proxyA = null;
        AbstractDocumentDao proxyB = null;


        handlerA = new DAOLogHandler(userDao);
        proxyA = (AbstractUserDao)Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(), new Class[]{AbstractUserDao.class}, handlerA);
        //proxyA = (AbstractUserDao)Proxy.newProxyInstance(UserDao.class.getClassLoader(), UserDao.class.getInterfaces(), handlerA);
        proxyA.findUserById("tommy");



        handlerB = new DAOLogHandler(documentDao);
        proxyB = (AbstractDocumentDao)Proxy.newProxyInstance(DocumentDao.class.getClassLoader(), DocumentDao.class.getInterfaces(), handlerB);
        proxyB.deleteDocumentById("D002");

    }
}
