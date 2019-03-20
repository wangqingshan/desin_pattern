package com.example.design.pattern.day18.impl;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 16:03
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        MySubject subject=new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();
    }
}
