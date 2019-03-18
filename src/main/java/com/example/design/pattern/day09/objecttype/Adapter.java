package com.example.design.pattern.day09.objecttype;

/**
 * Adapter
 *
 * @Title: Adapter.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 9:58
 * @Author 90
 */
public class Adapter implements Targetable {

    private Source source;
    public Adapter(Source source){
        super();//不写这个的话，系统会自动加上，没有父类，哪有子类
        this.source=source;
    }


    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("method2的方法");
    }
}
