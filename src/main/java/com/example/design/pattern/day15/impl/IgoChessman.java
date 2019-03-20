package com.example.design.pattern.day15.impl;

/**
 * IgoChessman
 *
 * @Title: IgoChessman.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-19 16:06
 * @Author 90
 */
public abstract class IgoChessman {

    /**
     * 共享抽象方法棋子颜色
     * @return
     */
    public abstract String chessColor();

    public void display(){
        System.out.println("棋子："+this.chessColor());
    }
}
