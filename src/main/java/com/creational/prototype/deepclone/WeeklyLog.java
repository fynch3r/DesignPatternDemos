package com.creational.prototype.deepclone;

import java.io.*;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 11:41
 **/


public class WeeklyLog implements Serializable {
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return (this.attachment);
    }

    public String getName() {
        return (this.name);
    }

    public String getDate() {
        return (this.date);
    }

    public String getContent() {
        return (this.content);
    }

    // 深克隆
    public WeeklyLog deepClone() throws Exception {
        // 序列化
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        // 反序列化
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object obj = objectInputStream.readObject();
        return (WeeklyLog)obj;
    }

}
