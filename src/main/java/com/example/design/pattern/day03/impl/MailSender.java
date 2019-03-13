package com.example.design.pattern.day03.impl;

/**
 * MailSender
 *
 * @Title: MailSender.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-13 10:06
 * @Author 90
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailSender");
    }
}
