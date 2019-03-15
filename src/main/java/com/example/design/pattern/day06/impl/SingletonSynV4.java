package com.example.design.pattern.day06.impl;


/**
 * SingletonSynV4
 *
 * @Title: SingletonSynV4.java
 * @Copyright: Copyright (c) 2005
 * @Description: 该代码为了解决性能问题，将创建和获取实例分开
 * @Company: 互动百科
 * @Created on 2019-3-15 13:55
 * @Author 90
 */
public class SingletonSynV4 {


    private static SingletonSynV4 instance=null;

    /*只在创建的时候加锁*/
    private static synchronized void init(){
        if(instance==null){
            instance=new SingletonSynV4();
        }

    }

    private SingletonSynV4(){}


    public static SingletonSynV4 getInstance(){

        if(instance==null){
            init();
        }
        return instance;
    }

}
