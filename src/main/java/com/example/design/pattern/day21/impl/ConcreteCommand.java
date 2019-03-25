package com.example.design.pattern.day21.impl;

/**
 * ConcreteCommand
 *
 * @Title: ConcreteCommand.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-25 10:49
 * @Author 90
 */
public class ConcreteCommand implements Command{

    /**
     * 持有一个接受者Receiver的引用，绑定一个特定的操作
     */
    public Receiver receiver;

    public ConcreteCommand(){

    }

    public ConcreteCommand(Receiver receiver){

        this.receiver=receiver;
    }


    @Override
    public void excute() {

        receiver.action();
    }

    @Override
    public void unDo() {

        receiver.unAction();
    }
}
