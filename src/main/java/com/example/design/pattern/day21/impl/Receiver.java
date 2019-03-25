package com.example.design.pattern.day21.impl;

/**
 * Receiver
 *
 * @Title: Receiver.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-25 10:50
 * @Author 90
 */
public class Receiver {



    public void action(){
        System.out.println("执行一个命令");
    }

    public void unAction(){
        System.out.println("撤销一个命令");
    }
}
