package com.example.design.pattern.day19.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteAggregate
 *
 * @Title: ConcreteAggregate.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-21 10:27
 * @Author 90
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private List<T> list=new ArrayList<>();


    @Override
    public void add(T t) {

        list.add(t);
    }

    @Override
    public void remove(T t) {

        list.remove(t);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(list);
    }
}
