package com.example.design.pattern.day10.impl;

/**
 * Decorator
 *
 * @Title: Decorator.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 13:49
 * @Author 90
 */
public class Decorator implements Sourceable{
    private Sourceable sourceable;
    @Override
    public void method() {

        System.out.println("开始装饰");
        sourceable.method();
        System.out.println("结束装饰");
    }

    public Decorator(Sourceable sourceable){
        super();
        this.sourceable=sourceable;
    }
}
