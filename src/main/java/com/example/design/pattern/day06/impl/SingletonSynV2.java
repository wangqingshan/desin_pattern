package com.example.design.pattern.day06.impl;

/**
 * SingletonSynV2
 *
 * @Title: SingletonSynV2.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-15 11:35
 * @Author 90
 */
public class SingletonSynV2 {


    private SingletonSynV2(){

    }

    private SingletonSynV2 instance=null;

    /*这样似乎解决了之前提到的问题，将synchronized关键字加在内部，也就是调用的时候不加锁
    * 只有在instance为null,并创建对象的时候才加锁，性能有了提升。但这样还是有问题：在java
    *指令中创建和赋值操作是分开进行的，也就是说instance=new SingletonSynV2();语句是分两步执行的
    * 但JVM并不保证这两个操作的先后顺序，也就是说，有可能JVM会为新的Singleton实例分配空间
    * 然后直接赋值给instance成员，然后再去初始化这个Singleton实例。这样就可能出错。
    * */

    /*以A、B两个线程为例：

      a>: A、B线程同时进入了第一个判断
      b>:A首先进入synchronized块，由于instance为null,所以它执行instance=new SingletonSynV2()
      c>:由于JVM的内部优化机制，JVM先划出一些空白内存给Single实例，并赋值给instance成员，注意此时JVM并没有开始初始化这个实例，然后A离开了synchronized块。
      d>:B进入synchronized块，由于instance此时不为null，因此它马上离开了synchronized块，并将结果返回给程序的调用方
      e>:此时B线程打算用SingletonSynV2实例，却发现它没有被初始化，于是错误发生了。

      所以，我们进一步优化。
     */
    public SingletonSynV2 getInstance(){
        if(instance==null){
            synchronized (instance){
                if(instance==null){
                    instance=new SingletonSynV2();
                }
            }

        }
        return instance;
    }



}
