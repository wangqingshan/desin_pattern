package com.example.design.pattern.day18.impl;

/**
 * Subject
 *
 * @Title: Subject.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-20 15:55
 * @Author 90
 */
public interface Subject {

    /**
     * 增加观察者
     * @param observer
     */
    public void add(Observer observer);
    /**
     * 删除观察者
     * @param observer
     */
    public void del(Observer observer);
    /**
     * 通知所有观察者
     * @param
     */
    public void notifyObservers();
    /**
     * 操作自身
     * @param
     */
    public void operation();
}
