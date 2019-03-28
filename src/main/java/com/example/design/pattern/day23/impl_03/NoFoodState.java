package com.example.design.pattern.day23.impl_03;

/**
 * NoFoodState
 *
 * @Title: NoFoodState.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-28 19:33
 * @Author 90
 */
public class NoFoodState extends State{
    @Override
    public void eat(Behavior behavior) {
        System.out.println("不是吃饭时间");
    }
}
