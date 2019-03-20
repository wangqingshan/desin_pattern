package com.example.design.pattern.day16.impl;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 14:02
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        String exp="2+8";
        ICalculator cal=new Plus();
        System.out.println(cal.calculater(exp));
    }
}
