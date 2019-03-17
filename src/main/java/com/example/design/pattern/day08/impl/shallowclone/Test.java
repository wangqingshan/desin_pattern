package com.example.design.pattern.day08.impl.shallowclone;

import java.io.IOException;

/**
 * author 90
 * description 测试深度复制
 * date 2019/3/17
 */
public class Test {

    public static void main(String[] args) {
        WeeklyLog log1,log2;
        log1=new WeeklyLog();
        Attachment attachment=new Attachment();
        log1.setAttachment(attachment);

        try {
            log2=log1.deepclone();
            System.out.println("克隆 日报类："+(log1==log2));
            System.out.println("测试附件："+(log1.getAttachment()==log2.getAttachment()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
