package com.example.design.pattern.day17.impl;

/**
 * CarModel
 *
 * @Title: CarModel.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 15:34
 * @Author 90
 */
public abstract class CarModel {


    /**
     * 汽车启动
     */
    protected abstract void start();

    /**
     * 停车
     */
    protected abstract void stop();

    /**
     * 用户并不需要关注你的车怎么启动或者停下来的，可以开可以停就可以啦
     */
    final public void exec(){
        this.start();
        this.stop();
    }
}
