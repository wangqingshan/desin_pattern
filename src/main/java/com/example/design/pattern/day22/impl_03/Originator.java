package com.example.design.pattern.day22.impl_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Originator
 *
 * @Title: Originator.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-25 19:34
 * @Author 90
 */
public class Originator {
    private List<String> states;

    /**
     * 检查点指数
     */
    private int index;

    public Originator(){
        states=new ArrayList<String>();
        index=0;
    }

    /**
     * 工厂方法，返回一个新的备忘录对象
     */
    public Memento createMemento(){
        return new Memento(states,index);
    }

    /**
     * 将发起人恢复到备忘录对象的状态上
     * @param memento
     */
    public void restoreMemento(Memento memento){
        states=memento.getStates();
        index=memento.getIndex();
    }

    /**
     * 状态赋值方法
     */
    public void setState(String state){
        states.add(state);
        index++;
    }

    /**
     * 打印所有的状态
     */
    public void printStates(){
        for (String state:states){
            System.out.println(state);
        }
    }


}
