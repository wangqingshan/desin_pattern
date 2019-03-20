package com.example.design.pattern.day15.impl;

import java.util.HashMap;
import java.util.Map;

/**
 * IgoChessmanFactory
 *
 * @Title: IgoChessmanFactory.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-19 16:10
 * @Author 90
 */
public class IgoChessmanFactory {


    /**
     * 首先私有化自己的类
     */
    public static IgoChessmanFactory igoChessmanFactory=new IgoChessmanFactory();

    //public static Map<String,IgoChessman> map=new HashMap<String,IgoChessman>(); 这样写不行
    public static Map<String,IgoChessman> map;//配合构造函数中创建Map对象
    /**
     * 私有化构造函数自己创建自己
     */
    private  IgoChessmanFactory(){
        map=new HashMap<String,IgoChessman>();
        map.put("white",new WhiteChessman());
        map.put("black",new BlackChessman());
    }

    /**
     * 提供一个全局访问方法
     * @return
     */
    public static IgoChessmanFactory getInstance(){
        return igoChessmanFactory;
    }

    /**
     * 工厂方法创建对象
     * @param name
     * @return
     */
    public static IgoChessman getIgoChessman(String name){

        return map.get(name);
    }



}
