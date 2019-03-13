package com.example.design.pattern.day03.impl;

/**
 * FactoryTest
 *
 * @Title: FactoryTest.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-13 11:12
 * @Author 90
 */
public class FactoryTest {

    public static void main(String[] args) {

        //不用实例化对象，可以直接使用
        SenderFactory.produceMail().Send();
    }
}
