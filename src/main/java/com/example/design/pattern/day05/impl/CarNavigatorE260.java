package com.example.design.pattern.day05.impl;

/**
 * CarNavigatorE260
 *
 * @Title: CarNavigatorE260.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-14 14:47
 * @Author 90
 */
public class CarNavigatorE260 implements CarNavigator{

    public CarNavigatorE260(){
        navigatorColor();
        navigatorPrice();
    }

    @Override
    public void navigatorColor() {
        System.out.println(" E260 navigator 颜色：黑");
    }

    @Override
    public void navigatorPrice() {
        System.out.println(" E260 navigator 价格：600");
    }
}
