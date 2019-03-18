package com.example.design.pattern.day13.impl;

import com.example.design.pattern.day13.impl.Sourceable;

/**
 * SourceSub1
 *
 * @Title: SourceSub1.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 15:26
 * @Author 90
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        System.out.println("第一个类中的方法");
    }
}
