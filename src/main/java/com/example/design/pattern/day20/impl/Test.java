package com.example.design.pattern.day20.impl;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-22 11:29
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        Support support=new OddSupport("奇数处理");
        Support support1=new NoSupport("不处理");
        Support support2=new LimitSupport("小于30",30);
        Support support3=new SpecialSupport("唯一处理",40);
        support.setNext(support1).setNext(support2).setNext(support3);
        for (int i=30;i<31;i++){
            support.support(new Task("值："+i,i));
        }
    }




}
