package com.example.design.pattern.day04.impl;

public class Test {

    public static void main(String[] args) {
        Sender sender=  new SendMailFactory().produce();
        sender.Send();


    }
}
