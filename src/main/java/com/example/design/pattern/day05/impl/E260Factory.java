package com.example.design.pattern.day05.impl;

/**
 * E260Factory
 *
 * @Title: E260Factory.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-14 14:52
 * @Author 90
 */
public class E260Factory implements BenzFactory{
    @Override
    public Benz createCar() {
        return new BenzE260();
    }

    @Override
    public CarNavigator createNavigator() {
        return new CarNavigatorE260();
    }
}
