package com.example.design.pattern.day09.classtype;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 9:35
 * @Author 90
 */
public class Test {


    public static void main(String[] args) {
        //这样Targetable就实现了类Source的功能
        Targetable targetable=new Adapter();

        targetable.method1();//深入理解面向接口编程
        targetable.method2();
    }
}
