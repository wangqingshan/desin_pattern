package com.example.design.pattern.day20.impl;

/**
 * OddSupport
 *
 * @Title: OddSupport.java
 * @Copyright: Copyright (c) 2005
 * @Description: 处理奇数任务码任务
 * @Company: 互动百科
 * @Created on 2019-3-22 11:20
 * @Author 90
 */
public class OddSupport extends Support{
    public OddSupport(String name){
        super(name);
    }


    @Override
    protected boolean resolve(Task task) {
        if(task.getNumber()%2==1){
            return true;
        }else{
            return false;
        }
    }
}
