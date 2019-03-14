package com.example.design.pattern.day05.impl;

/**
 * C180Factory
 *
 * @Title: C180Factory.java
 * @Copyright: Copyright (c) 2005
 * @Description: 生产C180车型和相关的导航仪
 * @Company: 互动百科
 * @Created on 2019-3-14 14:37
 * @Author 90
 */
public class C180Factory implements BenzFactory{
    @Override
    public Benz createCar() {
        return new BenzC180();
    }

    @Override
    public CarNavigator createNavigator() {
        return new CarNavigatorC180();
    }
}
