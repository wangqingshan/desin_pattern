package com.example.design.pattern.day07.impl;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-15 15:42
 * @Author 90
 */
public class Test {
    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();

        Product product=new Director().constructProduct(builder);

        System.out.println(product.getBasic());
    }
}
