package com.structural.bridge.images;

import com.structural.bridge.Image;
import com.structural.bridge.Matrix;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 14:34
 **/


public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        os.doPaint(m);
        System.out.println(fileName + " BMP. ");
    }
}
