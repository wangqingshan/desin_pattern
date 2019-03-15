package com.example.design.pattern.day07.impl;

/**
 * Director
 *
 * @Title: Director.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-15 15:39
 * @Author 90
 */
public class Director {

    public Product constructProduct(Builder builder){
        builder.buildBasic();
        builder.buildWall();
        builder.buildRoofed();
        return builder.buildProduct();
    }
}
