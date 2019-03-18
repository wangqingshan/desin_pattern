package com.example.design.pattern.day09.classtype;

/**
 * Source
 *
 * @Title: Source.java
 * @Copyright: Copyright (c) 2005
 * @Description: 类的适配器模式：Source类有个方法、待适配，目标接口是Targetable,通过Adapter类，
   将Source的功能扩展到Tagetable

 * @Company: 互动百科
 * @Created on 2019-3-18 9:25
 * @Author 90
 */
public class Source {

    public void method1(){
        System.out.println("这是source里的方法1");
    }
}
