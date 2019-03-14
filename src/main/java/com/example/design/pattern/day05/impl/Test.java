package com.example.design.pattern.day05.impl;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-14 14:54
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("生产奔驰C180");
        BenzFactory benzFactory=new C180Factory();
        benzFactory.createCar();
        benzFactory.createNavigator();


        System.out.println("生产奔驰E260");

        BenzFactory benzFactoryE260=new E260Factory();
        benzFactoryE260.createCar();
        benzFactoryE260.createNavigator();
    }
}
