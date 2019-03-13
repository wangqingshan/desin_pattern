package com.example.design.pattern.day03.impl;



/**
 * SenderFactory
 *
 * @Title: SenderFactory.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-13 10:56
 * @Author 90
 */
public class SenderFactory {

    //将原来的1个方法拆分成n个方法
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }


}
