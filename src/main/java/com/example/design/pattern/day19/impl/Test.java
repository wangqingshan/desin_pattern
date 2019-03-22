package com.example.design.pattern.day19.impl;


import java.util.ArrayList;
import java.util.List;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-21 10:46
 * @Author 90
 */
public class Test {


    public static void main(String[] args) {
        System.out.println("测试迭代器");

        User user1=new User("乔峰",30);
        User user2=new User("虚竹",20);
        User user3=new User("段誉",21);
        User user4=new User("慕容复",25);

        //测试迭代器
        Aggregate aggregate=new ConcreteAggregate<User>();
        aggregate.add(user1);aggregate.add(user2);aggregate.add(user3);aggregate.add(user4);

        Iterator<User> iterator=aggregate.createIterator();


        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }







    }
}
