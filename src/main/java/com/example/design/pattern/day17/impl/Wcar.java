package com.example.design.pattern.day17.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Wcar
 *
 * @Title: Wcar.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 15:35
 * @Author 90
 */
public class Wcar  extends CarModel{
    @Override
    protected void start() {
        System.out.println("大众汽车启动。。。");
    }

    @Override
    protected void stop() {
        System.out.println("大众汽车停止。。。");
    }
}
