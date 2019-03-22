package com.example.design.pattern.day19.impl;

/**
 * Aggregate
 *
 * @Title: Aggregate.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-21 10:24
 * @Author 90
 */
public interface Aggregate<T> {

    /**
     * 添加
     * @param t
     */
    void add(T  t);

    /**
     * 移除
     * @param t
     */
    void remove(T  t);

    /**
     * 创建迭代器
     * @return
     */
    Iterator<T> createIterator();
}
