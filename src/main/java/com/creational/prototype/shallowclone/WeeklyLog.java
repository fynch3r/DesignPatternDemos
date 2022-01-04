package com.creational.prototype.shallowclone;

/**
 * @program: DesignPattern
 * @description:
 * @author: fynch3r
 * @create: 2022-01-04 11:41
 **/


public class WeeklyLog implements Cloneable {
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


    @Override
    public WeeklyLog clone(){
        Object obj = null;
        try{
            obj = super.clone();
            return (WeeklyLog) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println(" 不支持浅克隆！");
            e.printStackTrace();
            return null;
        }
    }

}
