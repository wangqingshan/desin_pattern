package com.example.design.pattern.day04.impl;

public class MailSender implements  Sender {


    @Override
    public void Send() {
        System.out.println("mail send msg ");
    }
}
