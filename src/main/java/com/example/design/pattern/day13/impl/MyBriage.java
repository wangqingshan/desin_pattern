package com.example.design.pattern.day13.impl;

/**
 * MyBriage
 *
 * @Title: MyBriage.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 15:31
 * @Author 90
 */
public class MyBriage extends Briage {

    @Override
    public void method(){
        getSource().method();
    }
}
