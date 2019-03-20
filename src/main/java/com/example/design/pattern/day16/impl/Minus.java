package com.example.design.pattern.day16.impl;

/**
 * Minus
 *
 * @Title: Minus.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 14:00
 * @Author 90
 */
public class Minus  extends AbstractCalculator implements ICalculator {
    @Override
    public int calculater(String exp) {
        int arrayInt[]=split(exp,"\\+");
        return arrayInt[0]-arrayInt[1];
    }
}
