package com.example.design.pattern.day22.impl_01;

/**
 * Caretaker
 *
 * @Title: Caretaker.java
 * @Copyright: Copyright (c) 2005
 * @Description:负责人角色负责保存备忘录对象，但是不会修改甚至不会查看备忘录对象的内容
 * @Company: 互动百科
 * @Created on 2019-3-25 11:36
 * @Author 90
 */
public class Caretaker {

    private Memento memento;

    /**
     * 备忘录取值方法
     * @return
     */
    public Memento retrieveMemento(){
        return this.memento;
    }

    /**
     * 备忘录赋值方法
     * @param memento
     */
    public void saveMemento(Memento memento){
        this.memento=memento;
    }




}
