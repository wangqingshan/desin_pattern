package com.example.design.pattern.day06.impl;

import java.io.Serializable;

/**
 * Singleton
 *
 * @Title: Singleton.java
 * @Copyright: Copyright (c) 2005
 * @Description: 这个类可以满足基本要求，但是想这样毫无线程安全保护的类，如果是多线程环境，就有问题了。
 * @Company: 互动百科
 * @Created on 2019-3-14 16:43
 * @Author 90
 */
public class Singleton implements Serializable {

    /*持有私有静态示例，防止被引用，此处赋值为null,目的是实现延迟加载*/
    private static Singleton instance=null;

    /*私有构造方法，防止被实例化 */
    private Singleton(){

    }

    /*静态工程方法，创建示例*/
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    /** 没有这个方法，序列化的时候就不会有正确结果*/
    private Object readResolve() {
        return instance;
    }


}
