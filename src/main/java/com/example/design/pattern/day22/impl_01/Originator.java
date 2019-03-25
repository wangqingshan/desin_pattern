package com.example.design.pattern.day22.impl_01;

/**
 * Originator
 *
 * @Title: Originator.java
 * @Copyright: Copyright (c) 2005
 * @Description: 发起人角色利用一个新建的备忘录对象将自己的内部状态存储起来
 * @Company: 互动百科
 * @Created on 2019-3-25 11:26
 * @Author 90
 */
public class Originator {

    private String state;

    /**
     * 工厂方法，返回一个新的备忘录对象
     */
    public Memento createMemento(){
        return new Memento(state);
    }

    /**
     * 将发起人恢复到备忘录对象所记载的状态
     * @param memento
     */
    public void restoreMemento(Memento memento){
        this.state=memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态： "+state);
    }
}
