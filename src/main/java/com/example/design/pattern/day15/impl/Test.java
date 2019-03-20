package com.example.design.pattern.day15.impl;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-19 16:17
 * @Author 90
 */
public class Test {

    public static void main(String[] args) {

        IgoChessman b1,b2,w1,w2;
        //获取对应的工厂对象
        IgoChessmanFactory igoChessmanFactory=IgoChessmanFactory.getInstance();
        System.out.println(igoChessmanFactory);
        b1=IgoChessmanFactory.getIgoChessman("black");
        b2=IgoChessmanFactory.getIgoChessman("black");
        System.out.println(b1==b2);

    }
}
