package com.creational.prototype.shallowclone;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 11:44
 **/


public class Client {
    public static void main(String[] args) {
        WeeklyLog logPrevious,logNew;
        Attachment attachment = new Attachment();

        logPrevious = new WeeklyLog();
        logPrevious.setAttachment(attachment);

        logNew = logPrevious.clone();
        // 两个周报对象地址是否相同
        System.out.println(logNew == logPrevious);//false
        // 周报对象中的附件地址是否相同
        System.out.println(logNew.getAttachment() == logPrevious.getAttachment());//true





    }
}
