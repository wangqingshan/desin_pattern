package com.example.design.pattern.day18.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * AbstractSubject
 *
 * @Title: AbstractSubject.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 15:57
 * @Author 90
 */
public abstract class AbstractSubject implements Subject {

    private List<Observer> list=new ArrayList<Observer>();

    @Override
    public void add(Observer observer){
        list.add(observer);
    }
    /**
     * 删除观察者
     * @param observer
     */
    @Override
    public void del(Observer observer){
        list.remove(observer);
    }
    /**
     * 通知所有观察者
     * @param
     */
    @Override
    public void notifyObservers(){
        for(int i=0;i<list.size();i++){
            list.get(i).update();
        }
    }




}
