package com.creational.prototype.deepclone;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 12:03
 **/


public class Client {
    public static void main(String[] args) throws Exception {
        WeeklyLog logPrevious, logNew;
        Attachment attachment = new Attachment();
        logPrevious = new WeeklyLog();
        logPrevious.setAttachment(attachment);

        logNew = logPrevious.deepClone();

        // 两个周报对象地址是否相同
        System.out.println(logPrevious == logNew);// false
        // 各自内部的附件是否相同
        System.out.println(logPrevious.getAttachment() == logNew.getAttachment()); // false


    }
}
