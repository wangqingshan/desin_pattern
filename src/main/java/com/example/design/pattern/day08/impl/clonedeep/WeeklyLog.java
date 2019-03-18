package com.example.design.pattern.day08.impl.clonedeep;

import java.io.*;

/**
 * author 90
 * description 日志类，深度复制
 * date 2019/3/17
 */
public class WeeklyLog implements Cloneable, Serializable {
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
    //通过序列化进行深度克隆
    public WeeklyLog deepclone() throws ClassNotFoundException,IOException{
        //将对象写入流中
        ByteArrayOutputStream byteout=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(byteout);
        oos.writeObject(this);
        //将对象取出来
        ByteArrayInputStream bytein=new ByteArrayInputStream(byteout.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bytein);
        return (WeeklyLog)ois.readObject();
    }

}
