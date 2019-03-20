package com.example.design.pattern.day16.impl;

/**
 * Multiply
 *
 * @Title: Multiply.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 14:02
 * @Author 90
 */
public class Multiply  extends AbstractCalculator implements ICalculator {

    @Override
    public int calculater(String exp) {
        int arrayInt[]=split(exp,"\\+");
        return arrayInt[0]*arrayInt[1];
    }
}
