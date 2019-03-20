package com.example.design.pattern.day18.impl;

/**
 * MySubject
 *
 * @Title: MySubject.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 16:02
 * @Author 90
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        notifyObservers();
    }
}
