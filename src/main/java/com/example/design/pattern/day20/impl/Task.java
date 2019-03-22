package com.example.design.pattern.day20.impl;

/**
 * Quest
 *
 * @Title: Task.java
 * @Copyright: Copyright (c) 2005
 * @Description:要处理的任务
 * @Company: 互动百科
 * @Created on 2019-3-22 10:45
 * @Author 90
 */
public class Task {
    /**
     * 任务号
     */
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Task(){

    }

    public Task(String name,int number){
       this.name=name;
       this.number=number;
    }








}
