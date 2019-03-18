package com.example.design.pattern.day10.impl;

/**
 * DecoratorV2
 *
 * @Title: DecoratorV2.java
 * @Copyright: Copyright (c) 2005
 * @Description: 为什么这种写法不行？
 * @Company: 互动百科
 * @Created on 2019-3-18 14:02
 * @Author 90
 */
public class DecoratorV2 {

    private Sourceable sourceable;

    public void method() {

        System.out.println("开始装饰");
        sourceable.method();
        System.out.println("结束装饰");
    }

    public DecoratorV2(Sourceable sourceable){

        this.sourceable=sourceable;
    }
}
