package com.example.design.pattern.day23.impl_03;

/**
 * DinnerState
 *
 * @Title: DinnerState.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-28 19:30
 * @Author 90
 */
public class DinnerState extends State{
    @Override
    public void eat(Behavior behavior) {
        if(behavior.getTime()==18){
            System.out.println("吃晚餐");
        }else{
            behavior.setState(new NoFoodState());
            behavior.eat();
        }
    }
}
