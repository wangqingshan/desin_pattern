package com.example.design.pattern.day09.classtype;

/**
 * Adapter
 *
 * @Title: Adapter.java
 * @Copyright: Copyright (c) 2005
 * @Description: 这个就是个适配器
 * @Company: 互动百科
 * @Created on 2019-3-18 9:33
 * @Author 90
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("新类中的方法2");
    }
}
