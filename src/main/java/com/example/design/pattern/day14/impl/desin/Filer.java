package com.example.design.pattern.day14.impl.desin;

/**
 * Filer
 *
 * @Title: Filer.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 16:27
 * @Author 90
 */
public class Filer extends Node {

    public Filer(String name){
        super(name);
    }
    @Override
    public void display() {
        System.out.println(name);
    }
}
