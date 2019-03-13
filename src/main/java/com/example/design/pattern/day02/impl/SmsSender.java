package com.example.design.pattern.day02.impl;

/**
 * SmsSender
 *
 * @Title: SmsSender.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-13 10:06
 * @Author 90
 */
public class SmsSender implements Sender {


    @Override
    public void Send() {
        System.out.println("this is sms Sender");
    }
}
