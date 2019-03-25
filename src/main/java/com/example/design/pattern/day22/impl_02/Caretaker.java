package com.example.design.pattern.day22.impl_02;

/**
 * Caretaker
 *
 * @Title: Caretaker.java
 * @Copyright: Copyright (c) 2005
 * @Description: 负责人角色类Caretaker能够得到备忘录对象是以MementoIF为接口的，由于这个接口仅仅是个标识接口，因此负责人
 * 角色并不能改变这个备忘录对象的内容。
 * @Company: 互动百科
 * @Created on 2019-3-25 17:38
 * @Author 90
 */
public class Caretaker {


    private MementoIF memento;

    /**
     * 备忘录取值的方法
     * @return
     */
    public MementoIF retrieveMemento(){
        return memento;
    }

    public void saveMemento(MementoIF memento){
        this.memento=memento;
    }
}
