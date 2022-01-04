package com.creational.prototype.shallowclone;

/**
 * @program: DesignPattern
 * @description: 附件
 * @author: fynch3r
 * @create: 2022-01-04 11:40
 **/


public class Attachment {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void download() {
        System.out.println("Downloading attachment: " + name);
    }
}
