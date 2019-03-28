package com.example.design.pattern.day23.impl_02;

/**
 * BreakfastState
 *
 * @Title: BreakfastState.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-28 14:23
 * @Author 90
 */
public  class BreakfastState extends State{

    @Override
    public void eat(){
        System.out.println("吃早餐");
    }
}
