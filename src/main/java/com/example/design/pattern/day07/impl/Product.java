package com.example.design.pattern.day07.impl;

/**
 * Product
 *
 * @Title: Product.java
 * @Copyright: Copyright (c) 2005
 * @Description: 具体的产品，product
 * @Company: 互动百科
 * @Created on 2019-3-15 15:25
 * @Author 90
 */
public class Product {

    /*地基*/
    private String basic;

    /*墙*/
    private String wall;

    /*屋顶*/
    private String roofed;

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }
}
