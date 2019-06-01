package com.example.jvm.day003;

/**
 * author 90
 * description 测试静态变量初始化
 * date 2019/6/1
 */
public class Test {


    private static int i=0;
    static{

        i=2;
        System.out.println(i);

        //System.out.println(c); 这句将提示有问题，想想为什么？
        //静态语句块只能访问到定义在其之间的变量，对于定义在其后的变量可以赋值，不能访问
    }

    private static int c=1;


    public static void main(String[] args) {

    }
}
