package com.structural.bridge;

import com.structural.bridge.images.JPGImage;
import com.structural.bridge.osplatforms.Linux;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 14:42
 **/


public class Client {
    public static void main(String[] args) {
        Image image = null;
        OSPlatform os = null;
        image = new JPGImage();
        os = new Linux();
        image.setOSPlatform(os);
        image.parseFile(" test ");
    }
}
