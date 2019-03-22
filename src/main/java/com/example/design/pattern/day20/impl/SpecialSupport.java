package com.example.design.pattern.day20.impl;

/**
 * SpecialSupport
 *
 * @Title: SpecialSupport.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-22 11:23
 * @Author 90
 */
public class SpecialSupport extends Support{


    private int number;

    public SpecialSupport(String name,int number){

        super(name);
        this.number=number;
    }


    @Override
    protected boolean resolve(Task task) {
        if(task.getNumber()==this.number){
            return true;
        }else{
            return false;
        }
    }
}
