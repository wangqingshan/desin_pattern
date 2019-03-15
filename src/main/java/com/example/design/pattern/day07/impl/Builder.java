package com.example.design.pattern.day07.impl;

/**
 * Builder
 *
 * @Title: Builder.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-15 15:30
 * @Author 90
 */
public interface Builder {

    /*打基础*/
    public void buildBasic();

    /*筑墙*/
    public void buildWall();

    /*建屋顶*/
    public void buildRoofed();

    /*构建房子*/
    public Product buildProduct();

}
