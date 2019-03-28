package com.example.design.pattern.day23.impl_03;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-28 19:53
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {
        Behavior behavior=new Behavior();
        behavior.setTime(7);
        behavior.eat();

        behavior.setTime(18);
        behavior.eat();

    }
}
