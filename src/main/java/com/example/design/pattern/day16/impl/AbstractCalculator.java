package com.example.design.pattern.day16.impl;

/**
 * AbstractCalculator
 *
 * @Title: AbstractCalculator.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 13:57
 * @Author 90
 */
public class AbstractCalculator {

    public int[] split(String exp,String opt){
        String array[]=exp.split(opt);
        int arrayInt[]=new int[2];
        arrayInt[0]=Integer.valueOf(array[0]);
        arrayInt[1]=Integer.valueOf(array[1]);
        return arrayInt;
    }
}
