package com.example.design.pattern.day09.interfacetype;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 10:27
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        Sourceable sourceable= new SourceSub1();
        Sourceable sourceable2= new SourceSub2();

        sourceable.method1();
        sourceable2.method2();
    }
}
