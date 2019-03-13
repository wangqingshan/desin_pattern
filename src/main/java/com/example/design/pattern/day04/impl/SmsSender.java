package com.example.design.pattern.day04.impl;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println(" sms send msg");
    }
}
