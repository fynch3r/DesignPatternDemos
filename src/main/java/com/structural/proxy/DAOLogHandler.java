package com.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 16:32
 **/


public class DAOLogHandler implements InvocationHandler {

    private Object obj;
    private Calendar calendar;

    public DAOLogHandler(Object object) {
        this.obj = object;
    }


    public void beforeInvoke(){
        calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour + ":" + minute + ":" + second;
        System.out.println("Cost time: " + time);
    }
    public void afterInvoke(){
        System.out.println("Finish invoke; ");
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(obj, args);
        afterInvoke();
        return result;
    }

}
