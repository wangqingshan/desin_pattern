package com.example.design.pattern.day06.impl;

import java.util.List;

/**
 * SingletonSynV5
 *
 * @Title: SingletonSynV5.java
 * @Copyright: Copyright (c) 2005
 * @Description: 该方法采用“影子实例”的方法，来为单例对象的属性同步更新
 * @Company: 互动百科
 * @Created on 2019-3-15 14:16
 * @Author 90
 */
public class SingletonSynV5 {

    private static SingletonSynV5 instance=null;
    private SingletonSynV5(){}

    private List properties =null;

    private List getProperties(){
        return properties;
    }


    private static synchronized  void init(){
        if(instance==null){
            instance=new SingletonSynV5();
        }
    }

    public static SingletonSynV5 getInstance(){
        if(instance==null){
            init();
        }
        return instance;
    }

    /*注意这里没有参数*/
    public void updateProperties(){
        SingletonSynV5 shadow=new SingletonSynV5();
        properties=shadow.getProperties();
    }
    /*
    * 之所以这样做，是有原因的
    * 通常，为了实现配置信息的实时更新，会有一个线程不停检测配置文件或配置数据库的内容，一旦发现变化，就更新到单例对象的属性中。
    * 在更新这些信息的时候，很可能还会有其他线程正在读取这些信息，造成意想不到的后果。
    * 还是以通过单例对象属性停止线程服务为例，如果更新属性时读写不同步，可能访问该属性时这个属性正好为空（null），程序就会抛出异常。
    */


}
