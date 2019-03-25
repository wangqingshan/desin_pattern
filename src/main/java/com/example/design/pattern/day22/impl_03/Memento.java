package com.example.design.pattern.day22.impl_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Memento
 *
 * @Title: Memento.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-25 19:36
 * @Author 90
 */
public class Memento {

    private List<String> states;

    /**
     * 检查点指数
     */
    private int index;

    public Memento(List<String> states,int index){
        this.states=new ArrayList<String>(states);
        this.index=index;

    }

    public List<String> getStates(){
        return states;
    }

    public int getIndex(){
        return index;
    }
}
