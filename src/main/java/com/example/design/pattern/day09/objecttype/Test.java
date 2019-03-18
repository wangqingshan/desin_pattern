package com.example.design.pattern.day09.objecttype;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 10:03
 * @Author 90
 */
public class Test {
    public static void main(String[] args) {
        Source source=new Source();
        Targetable targetable=new Adapter(source);

        targetable.method1();
    }
}
