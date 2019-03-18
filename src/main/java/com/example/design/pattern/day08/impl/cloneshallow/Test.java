package com.example.design.pattern.day08.impl.cloneshallow;

/**
 * author 90
 * description 测试类
 * date 2019/3/17
 */
public class Test {

    public static void main(String[] args) {
        WeeklyLog log1,log2;
        log1=new WeeklyLog();
        Attachment attachment=new Attachment();
        log1.setAttachment(attachment);

        log2=log1.clone();
        System.out.println("克隆 日报类："+(log1==log2));
        System.out.println("测试附件："+(log1.getAttachment()==log2.getAttachment()));
    }
}
