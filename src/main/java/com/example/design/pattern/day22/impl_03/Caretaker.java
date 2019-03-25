package com.example.design.pattern.day22.impl_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker
 *
 * @Title: Caretaker.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-25 19:43
 * @Author 90
 */
public class Caretaker {

    private Originator originator;
    private List<Memento> mementos=new ArrayList<Memento>();
    private int current;

    public Caretaker(Originator originator){
        this.originator=originator;
        this.current=0;
    }

    /**
     * 创建一个新的检查点
     * @return
     */
    public int createMemento(){
        Memento memento=originator.createMemento();
        mementos.add(memento);
        return current++;

    }

    /**
     * 将发起人恢复到某个检查点
     * @param index
     */
    public void restoreMemento(int index){
        Memento memento=mementos.get(index);
        originator.restoreMemento(memento);
    }

    /**
     * 移除某个检查点
     * @param index
     */
    public void removeMemento(int index){
        mementos.remove(index);
    }
}
