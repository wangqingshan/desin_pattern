package com.example.design.pattern.day05.impl;

/**
 * BenzFactory
 *
 * @Title: BenzFactory.java
 * @Copyright: Copyright (c) 2005
 * @Description: 奔驰工厂抽象接口
 * @Company: 互动百科
 * @Created on 2019-3-14 14:34
 * @Author 90
 */
public interface BenzFactory {

    //创建奔驰方法
    Benz createCar();

    //创建导航仪方法
    CarNavigator createNavigator();

}
