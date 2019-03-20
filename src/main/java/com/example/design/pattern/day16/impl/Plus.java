package com.example.design.pattern.day16.impl;

/**
 * Plus
 *
 * @Title: Plus.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 13:59
 * @Author 90
 */
public class Plus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculater(String exp) {
        int arrayInt[]=split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
