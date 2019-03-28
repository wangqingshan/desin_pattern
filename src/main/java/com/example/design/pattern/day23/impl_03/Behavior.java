package com.example.design.pattern.day23.impl_03;

/**
 * Behavior
 *
 * @Title: Behavior.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-28 19:17
 * @Author 90
 */
public class Behavior {

    private int time;

    private State state=null;

    public Behavior(){
        state=new BreakfastState();
    }


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void eat(){
        //逻辑取出，这里只剩下方法调用
        state.eat(this);

        //当所有的方法都完成后，回到最初始的状态
        state=new BreakfastState();
    }
}
