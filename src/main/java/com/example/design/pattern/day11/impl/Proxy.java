package com.example.design.pattern.day11.impl;

/**
 * Proxy
 *
 * @Title: Proxy.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 14:21
 * @Author 90
 */
public class Proxy implements Sourceable{
    private Source source;
    @Override
    public void method() {

        before();
        source.method();
        after();

    }
    public Proxy(){
        super();
        this.source=new Source();
    }

    private void after(){
        System.out.println("after proxy");
    }

    private void before(){
        System.out.println("before proxy");
    }
}
