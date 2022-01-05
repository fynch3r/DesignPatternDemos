package com.structural.composite;

import com.structural.composite.file.Folder;
import com.structural.composite.file.ImageFile;
import com.structural.composite.file.TextFile;
import com.structural.composite.file.VideoFile;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 15:15
 **/


public class Client {
    public static void main(String[] args) {
        AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;

        folder1 = new Folder("folder1");
        folder2 = new Folder("folder2");
        folder3 = new Folder("folder3");
        folder4 = new Folder("folder4");

        file1 = new ImageFile("file1");
        file2 = new ImageFile("file2");
        file3 = new TextFile("file3");
        file4 = new TextFile("file4");
        file5 = new VideoFile("file5");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder1.killVirus();
    }
}
