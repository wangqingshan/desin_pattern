package com.example.design.pattern.day23.impl_03;

/**
 * LunchState
 *
 * @Title: LunchState.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-28 19:28
 * @Author 90
 */
public class LunchState extends State{
    @Override
    public void eat(Behavior behavior) {
        if(behavior.getTime()==12){
            System.out.println("吃午餐");
        }else{
            behavior.setState(new DinnerState());
            behavior.eat();
        }
    }
}
