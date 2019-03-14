package com.example.design.pattern.day05.impl;

/**
 * CarNavigatorC180
 *
 * @Title: CarNavigatorC180.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-14 14:43
 * @Author 90
 */
public class CarNavigatorC180 implements CarNavigator{

    public CarNavigatorC180(){
        navigatorColor();
        navigatorPrice();
    }
    @Override
    public void navigatorColor() {
        System.out.println(" C180 navigator 颜色：红");
    }

    @Override
    public void navigatorPrice() {
        System.out.println(" C180 navigator 价格：500");
    }
}
