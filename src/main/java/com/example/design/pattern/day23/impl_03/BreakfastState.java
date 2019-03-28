package com.example.design.pattern.day23.impl_03;



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
    public void eat(Behavior behavior) {

        if(behavior.getTime()==7){
            System.out.println("吃早餐");
        }else{
            //如果条件不符合，重置state为下一个状态
            behavior.setState(new LunchState());
            behavior.eat();
        }
    }
}
