package com.example.design.pattern.day08.impl.cloneshallow;

/**
 * author 90
 * description 周报类，充当具体的原型
 * date 2019/3/16
 */
public class WeeklyLog implements  Cloneable{

    private Attachment attachment;
    private String date;
    private String name;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //实现clone()方法实现浅度克隆
    public WeeklyLog clone(){

        Object obj=null;

        try {
            obj=super.clone();
            return (WeeklyLog)obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持克隆方法");
            return null;
        }




    }
}
