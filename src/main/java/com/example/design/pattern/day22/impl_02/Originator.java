package com.example.design.pattern.day22.impl_02;

import com.example.design.pattern.day22.impl_01.Memento;

/**
 * Originator
 *
 * @Title: Originator.java
 * @Copyright: Copyright (c) 2005
 * @Description: 在java语言中，实现双重接口的办法就是将备忘录角色类设计成发起人角色类的内部成员类
   将Memento设成Originator类的内部类，从而将Memento对象封装在Originator里面；在外部提供一个标识接口MementoIF给Caretaker以及其他对象。
   这样，Originator类看到的是Menmento的所有接口，而Caretaker以及其他对象看到的仅仅是标识接口MementoIF所暴露出来的接口。（理解）
 * @Company: 互动百科
 * @Created on 2019-3-25 17:20
 * @Author 90
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态： "+state);
    }

    /**
     * 工厂方法，返回一个新的备忘录对象
     * @return
     */
    public MementoIF createMemento(){
        return new Memento(state);
    }

    /**
     * 发起人恢复到备忘录对对象的记录的状态
     * @param memento
     */
    public void restoreMemento(MementoIF memento){

        String thisState=((Memento) memento).getState();
        this.setState(thisState);
    }









    private class Memento  implements MementoIF{

        private String state;

        private Memento(String state){
            this.state=state;
        }
        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }


    }


}
