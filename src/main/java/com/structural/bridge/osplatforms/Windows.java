package com.structural.bridge.osplatforms;

import com.structural.bridge.Matrix;
import com.structural.bridge.OSPlatform;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 14:40
 **/


public class Windows implements OSPlatform {
    @Override
    public void doPaint(Matrix m) {
        System.out.println(" Windows 系统绘图 ");
    }
}
