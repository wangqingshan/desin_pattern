package com.example.design.pattern.day19.impl;

import java.util.List;

/**
 * ConcreteIterator
 *
 * @Title: ConcreteIterator.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-21 10:29
 * @Author 90
 */
public class ConcreteIterator<T> implements Iterator<T> {

    /**
     * 维持一个对具体聚合对象的引用，以便于访问存储在聚合对象中的数据
     */
    private List<T> list;

    /**
     * 定义一个游标，用于记录当前的访问位置
     */
    private int cursor;


    public ConcreteIterator(List<T> list){

        this.cursor=0;
        this.list=list;
    }

    @Override
    public T first() {
        return list.get(0);
    }

    @Override
    public T next() {
        T obj=null;
        if(this.hasNext()){
            obj=this.list.get(cursor++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(cursor>=list.size()){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public T currentItem() {
        return list.get(cursor);
    }
}
