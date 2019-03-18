package com.example.design.pattern.day09.objecttype;

/**
 * Source
 *
 * @Title: Source.java
 * @Copyright: Copyright (c) 2005
 * @Description: 对象的适配器模式，只是将Adapter做修改，不再继承Source类，而是持有其实例，以达到解决兼容性问题

 * @Company: 互动百科
 * @Created on 2019-3-18 9:25
 * @Author 90
 */
public class Source {

    public void method1(){
        System.out.println("这是source里的方法1");
    }
}
