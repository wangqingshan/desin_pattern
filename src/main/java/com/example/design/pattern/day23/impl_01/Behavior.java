package com.example.design.pattern.day23.impl_01;

/**
 * Behavior
 *
 * @Title: Behavior.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-26 15:21
 * @Author 90
 */
public class Behavior {


    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void eat(){
        if(time ==7){
            System.out.println("吃早饭");
        }else if(time==12){
            System.out.println("吃午饭");
        }else if(time==18){
            System.out.println("吃晚饭");
        }else{
            System.out.println("未到吃饭时间");
        }
    }





}
