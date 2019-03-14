package com.example.design.pattern.day05.impl;

/**
 * BenzE260
 *
 * @Title: BenzE260.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-14 14:45
 * @Author 90
 */
public class BenzE260  implements Benz{

    public BenzE260(){
        carColor();
        carSpeed();
        carPrice();
    }
    @Override
    public void carColor() {

        System.out.println("benzE260 颜色：黑");
    }

    @Override
    public void carSpeed() {
        System.out.println("benzE260 速度：240km/s");
    }

    @Override
    public void carPrice() {
        System.out.println("benzE260 价格：180w");
    }
}
