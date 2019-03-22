package com.example.design.pattern.day20.impl;



/**
 * NoSupport
 *
 * @Title: NoSupport.java
 * @Copyright: Copyright (c) 2005
 * @Description: 该类不解决任何问题
 * @Company: 互动百科
 * @Created on 2019-3-22 10:59
 * @Author 90
 */
public class NoSupport extends Support {

    public NoSupport(String name){
        super(name);
    }
    @Override
    protected boolean resolve(Task task) {
        return false;
    }
}
