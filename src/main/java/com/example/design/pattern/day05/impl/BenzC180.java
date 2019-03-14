package com.example.design.pattern.day05.impl;

/**
 * BenzC180
 *
 * @Title: BenzC180.java
 * @Copyright: Copyright (c) 2005
 * @Description:  BenzC180车型
 * @Company: 互动百科
 * @Created on 2019-3-14 14:39
 * @Author 90
 */
public class BenzC180 implements Benz{

    public BenzC180(){
        carColor();
        carSpeed();
        carPrice();
    }

    @Override
    public void carColor() {

        System.out.println("benzC180 颜色：红");
    }

    @Override
    public void carSpeed() {
        System.out.println("benzC180 速度：200km/s");
    }

    @Override
    public void carPrice() {
        System.out.println("benzC180 价格：80w");
    }
}
