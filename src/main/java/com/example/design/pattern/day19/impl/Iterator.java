package com.example.design.pattern.day19.impl;

/**
 * Iterator
 *
 * @Title: Iterator.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-21 10:17
 * @Author 90
 */
public interface Iterator<T> {

    /**
     * 游标指向第一个元素
     * @return
     */
    T first();

    /**
     * 游标指向下一个元素
     * @return
     */
    T next();

    /**
     * 判断是否有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 获取游标指向的第一个元素
     * @return
     */
    T currentItem();
}
