package com.example.design.pattern.day07.impl;

/**
 * ConcreteBuilder
 *
 * @Title: ConcreteBuilder.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-15 15:37
 * @Author 90
 */
public class ConcreteBuilder implements Builder {

    private Product product;

    public ConcreteBuilder(){
        product= new Product();
    }

    @Override
    public void buildBasic() {
        product.setBasic("打地基");
    }

    @Override
    public void buildWall() {
        product.setWall("砌墙");
    }

    @Override
    public void buildRoofed() {
        product.setRoofed("建屋顶");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
