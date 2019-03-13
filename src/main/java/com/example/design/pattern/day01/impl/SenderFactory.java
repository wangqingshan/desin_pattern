package com.example.design.pattern.day01.impl;

/**
 * SenderFactory
 *
 * @Title: SenderFactory.java
 * @Copyright: Copyright (c) 2005
 * @Description: 该类为工厂类,
 * @Company: 互动百科
 * @Created on 2019-3-13 10:08
 * @Author 90
 */
public class SenderFactory {

    public Sender produce(String type){
        if ("mail".equals(type)) {
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确类型");
            return null;
        }
    }


}
