package com.example.design.pattern.day02.impl;

/**
 * FactoryTest
 *
 * @Title: FactoryTest.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-13 11:01
 * @Author 90
 */
public class FactoryTest {

    public static void main(String[] args) {

        SenderFactory factory=new SenderFactory();
        factory.produceMail().Send();
    }
}
