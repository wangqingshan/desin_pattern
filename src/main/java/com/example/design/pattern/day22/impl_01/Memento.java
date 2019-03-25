package com.example.design.pattern.day22.impl_01;

/**
 * Memento
 *
 * @Title: Memento.java
 * @Copyright: Copyright (c) 2005
 * @Description:备忘录对象将发起人对象传入的状态存储起来
 * @Company: 互动百科
 * @Created on 2019-3-25 11:27
 * @Author 90
 */
public class Memento {

    private String state;

    public Memento(){

    }
    public Memento(String state){

        this.state=state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
