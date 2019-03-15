package com.example.design.pattern.day06.impl;

import org.junit.Assert;

import java.io.*;

/**
 * SerSingletonTest
 *
 * @Title: SerSingletonTest.java
 * @Copyright: Copyright (c) 2005
 * @Description: 测试readResolve 在序列化中的作用
 * @Company: 互动百科
 * @Created on 2019-3-14 17:00
 * @Author 90
 */
public class SerSingletonTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton s1 = null;
        Singleton s = Singleton.getInstance();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\test\\Desktop\\a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream("C:\\Users\\test\\Desktop\\a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (Singleton) ois.readObject();
        System.out.println("s1"+s1);
        System.out.println("s"+s);


    }


}
