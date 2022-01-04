package com.creational.prototype.deepclone;

import java.io.Serializable;

/**
 * @program: DesignPattern
 * @description: 附件
 * @author: fynch3r
 * @create: 2022-01-04 11:40
 **/


public class Attachment implements Serializable {
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
