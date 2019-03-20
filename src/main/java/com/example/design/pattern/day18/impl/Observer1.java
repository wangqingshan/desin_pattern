package com.example.design.pattern.day18.impl;

/**
 * Observer1
 *
 * @Title: Observer1.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 15:51
 * @Author 90
 */
public class Observer1 implements Observer {


    @Override
    public void update() {
        System.out.println("observer1 has received msg");
    }
}
