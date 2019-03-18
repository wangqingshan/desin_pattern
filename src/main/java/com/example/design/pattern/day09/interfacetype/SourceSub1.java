package com.example.design.pattern.day09.interfacetype;

/**
 * SourceSub1
 *
 * @Title: SourceSub1.java
 * @Copyright: Copyright (c) 2005
 * @Description: 实际开发中，我们也常会遇到这种接口中定义很多方法，但有时我们在一些实现类中并不是都需要的
 * @Company: 互动百科
 * @Created on 2019-3-18 10:21
 * @Author 90
 */
public class SourceSub1 extends Wrapper{



    @Override
    public void method1(){
        System.out.println("只实现了方法一");
    }

}
