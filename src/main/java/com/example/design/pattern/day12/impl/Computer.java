package com.example.design.pattern.day12.impl;

/**
 * Computer
 *
 * @Title: Computer.java
 * @Description:
 * @Created on 2019-3-18 15:05
 * @Author 90
 */
public class Computer {

    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cpu=new Cpu();
        memory=new Memory();
        disk=new Disk();
    }

    public void startUp(){
        System.out.println("start the computer");
        cpu.startUp();
        memory.startUp();
        disk.startUp();
        System.out.println("start the computer finished!");
    }

    public void shutDown(){
        System.out.println("shutdown the computer");
        cpu.shutDown();
        memory.shutDown();
        disk.shutDown();
        System.out.println("the computer closed");
    }
}
