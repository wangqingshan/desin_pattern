package com.example.design.pattern.day17.impl;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 15:37
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        CarModel wcar=new Wcar();
        wcar.exec();

        CarModel ocar=new Ocar();
        ocar.exec();
    }
}
