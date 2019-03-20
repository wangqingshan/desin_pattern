package com.example.design.pattern.day17.impl;

/**
 * Ocar
 *
 * @Title: Ocar.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 15:36
 * @Author 90
 */
public class Ocar extends CarModel {
    @Override
    protected void start() {
        System.out.println("奥迪汽车启动。。。");
    }

    @Override
    protected void stop() {
        System.out.println("奥迪汽车停止。。。");
    }
}
