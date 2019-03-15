package com.example.design.pattern.day06.impl;

/**
 * SingletonSyn
 *
 * @Title: SingletonSyn.java
 * @Copyright: Copyright (c) 2005
 * @Description: 为了保证线程安全首先想到了 synchronized 关键字
 * @Company: 互动百科
 * @Created on 2019-3-15 10:35
 * @Author 90
 */
public class SingletonSyn {

    private SingletonSyn instance=null;

    /* 这样做有个弊端，synchronized 关键字锁住了这个对象，这样的使用在性能上会有下降，因为每次调用getInstance,都要加上对象锁
      * 事实上只有第一次创建的时候需要加锁，之后就不需要了。所以这里仍旧需要改进
      *
    */
    public synchronized SingletonSyn getInstance(){
        if(instance==null){
            instance=new SingletonSyn();
        }
        return instance;
    }

    private SingletonSyn(){}
}
