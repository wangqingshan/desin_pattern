package com.example.design.pattern.day20.impl;

/**
 * LimitSupport
 *
 * @Title: LimitSupport.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-22 11:09
 * @Author 90
 */
public class LimitSupport extends Support{

    private int limit;

    public LimitSupport(String name,int limit){
        super(name);
        this.limit=limit;
    }

    @Override
    protected boolean resolve(Task task) {
        if(this.limit<task.getNumber()){
            return true;
        }else{
            return false;
        }
    }
}
