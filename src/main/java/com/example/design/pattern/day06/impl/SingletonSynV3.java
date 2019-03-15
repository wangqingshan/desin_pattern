package com.example.design.pattern.day06.impl;



/**
 * SingletonSynV3
 *
 * @Title: SingletonSynV3.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-15 13:41
 * @Author 90
 */
public class SingletonSynV3 {

    private SingletonSynV3(){}

    private static class SingletonFactory{
        private static SingletonSynV3 instance=new SingletonSynV3();
    }
    /*获取实例*/
    public static SingletonSynV3 getInstance(){
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

    /*实际上，单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
      这样当我们第一次调用getinstance的时候，JVM能够帮我们保证instance只被创建一次，并且会把赋值给instance的内存
      初始化完毕，这样我们就不用担心声明的问题。同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能的问题。
      暂且认为这是个完美的模式

      但要注意的是：在构造函数中抛出异常，示例将永远得不到创建，也会出错，所以十分完美的东西是不存在的。只能根据实际情况，选择最合适的

      也有人这样实现：因为我们只需在类创建的时候同步，所以只需要将创建和getInstance分开，单独为创建加synchronized关键字也是可以的
      参考SingletonSynV4
    */
}
