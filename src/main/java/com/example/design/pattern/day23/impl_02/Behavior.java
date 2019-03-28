package com.example.design.pattern.day23.impl_02;

/**
 * Behavior
 *
 * @Title: Behavior.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-28 19:11
 * @Author 90
 */
public class Behavior {

    private int time;

    State state=null;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    public void eat(){
        if(time==7){
            state=new BreakfastState();
        }else if(time==12){
            state=new LunchState();
        }else if(time==18){
            state=new DinnerState();
        }else{
            state=new NoFoodState();
        }
    }
}
