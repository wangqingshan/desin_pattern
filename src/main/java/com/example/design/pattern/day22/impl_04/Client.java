package com.example.design.pattern.day22.impl_04;

/**
 * Client
 *
 * @Title: Client.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-26 14:51
 * @Author 90
 */
public class Client {

    public static void main(String[] args) {
        Originator o=new Originator();

        //修改状态
        o.changeState("state 0");
        //创建备忘录
        MementoIF memento=o.createMemento();
        //修改状态
        o.changeState("state 1");
        //按照备忘录恢复对象的状态
        o.restoreMemento(memento);
    }
}
