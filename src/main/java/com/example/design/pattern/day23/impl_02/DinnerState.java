package com.example.design.pattern.day23.impl_02;

/**
 * DinnerState
 *
 * @Title: DinnerState.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-28 19:08
 * @Author 90
 */
public class DinnerState extends State{
    @Override
    public void eat() {
        System.out.println("吃晚餐");
    }
}
