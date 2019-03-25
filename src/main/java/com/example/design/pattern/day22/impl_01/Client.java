package com.example.design.pattern.day22.impl_01;

/**
 * Client
 *
 * @Title: Client.java
 * @Copyright: Copyright (c) 2005
 * @Description: 客户端角色类
 * @Company: 互动百科
 * @Created on 2019-3-25 17:09
 * @Author 90
 */
public class Client {


    public static void main(String[] args) {
        Originator originator=new Originator();

        Caretaker caretaker=new Caretaker();
        //改变负责人对象的状态
        originator.setState("On");
        //创建备忘录对象，并将发起人对象存储起来
        caretaker.saveMemento(originator.createMemento());
        //修改发起人的状态
        originator.setState("Off");
        //恢复发起人的状态
        originator.restoreMemento(caretaker.retrieveMemento());

        System.out.println("状态值： "+originator.getState());
    }
}
