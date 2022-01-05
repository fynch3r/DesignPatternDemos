package com.structural.composite.file;

import com.structural.composite.AbstractFile;

import java.util.ArrayList;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 15:12
 **/


public class Folder extends AbstractFile {

    private String name;

    private ArrayList<AbstractFile> fileList=new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("Killing virus for folder " + name);
        // 循环杀毒
        for (AbstractFile abstractFile : fileList) {
            abstractFile.killVirus();
        }
    }
}
