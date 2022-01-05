package com.structural.composite.file;

import com.structural.composite.AbstractFile;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 15:04
 **/


public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("Not support!");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("Not support!");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("Not support!");
        return null;
    }

    @Override
    public void killVirus() {
        // 模拟杀毒
        System.out.println("Killing virus for "+name);
    }
}
