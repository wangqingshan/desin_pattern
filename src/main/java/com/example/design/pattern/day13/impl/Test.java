package com.example.design.pattern.day13.impl;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 15:33
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        Briage briage=new MyBriage();
        Sourceable source1=new SourceSub1();
        briage.setSource(source1);
        briage.method();
    }
}
