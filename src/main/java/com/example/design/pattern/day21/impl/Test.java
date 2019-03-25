package com.example.design.pattern.day21.impl;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-25 10:56
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        //创建命令接受者
        Receiver receiver=new Receiver();
        //创建命令对象，并设定它的接受者
        Command command=new ConcreteCommand(receiver);

        //创建命令执行者，并将相应的命令作为参数传递给Invoker
        Invoker invoker=new Invoker();
        invoker.setCommand(command);
        //用户端测试

        invoker.excuteCommand();

        invoker.undoCommand();



    }
}
