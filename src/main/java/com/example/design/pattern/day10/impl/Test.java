package com.example.design.pattern.day10.impl;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 13:54
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        Source source=new Source();
        Decorator decorator=new Decorator(source);
        decorator.method();

        //假如不用接口呢？
        DecoratorV2 decoratorv2=new DecoratorV2(source);
        decoratorv2.method();
    }
}
