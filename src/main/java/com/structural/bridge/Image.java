package com.structural.bridge;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 14:21
 **/


public abstract class Image {
    // 操作系统平台
    protected OSPlatform os;

    public void setOSPlatform(OSPlatform os){
        this.os = os;
    }

    public abstract void parseFile(String fileName);
}
