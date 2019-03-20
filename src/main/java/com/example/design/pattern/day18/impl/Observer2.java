package com.example.design.pattern.day18.impl;

/**
 * Observer2
 *
 * @Title: Observer2.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 15:52
 * @Author 90
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received msg");
    }
}
