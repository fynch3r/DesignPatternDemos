package com.structural.bridge.osplatforms;

import com.structural.bridge.Matrix;
import com.structural.bridge.OSPlatform;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 14:39
 **/


public class Linux implements OSPlatform {
    @Override
    public void doPaint(Matrix m) {
        System.out.println(" Linux系统绘图 ");
    }
}
