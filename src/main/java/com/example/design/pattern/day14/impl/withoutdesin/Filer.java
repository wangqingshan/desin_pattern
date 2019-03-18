package com.example.design.pattern.day14.impl.withoutdesin;

/**
 * Filer
 *
 * @Title: Filer.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 16:00
 * @Author 90
 */
public class Filer {

    private String fileName;

    public Filer(String fileName){
        this.fileName=fileName;
    }

    public void display(){
        System.out.println(fileName);
    }
}
