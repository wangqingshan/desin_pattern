package com.example.design.pattern.day13.impl;

/**
 * Briage
 *
 * @Title: Briage.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 15:29
 * @Author 90
 */
public abstract class Briage {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

}
