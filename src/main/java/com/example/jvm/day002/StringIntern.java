package com.example.jvm.day002;

/**
 * author 90
 * description 测试String创建
 * date 2019/5/26
 */
public class StringIntern {


    public static void main(String[] args) {
        String str1 = "计算机";
        String str2 = "计算机";
        System.out.println("str1==str2:" + (str1 == str2));

        String str3 = new String("计算机");
        System.out.println("str1==str3:" + (str1 == str3));
        System.out.println("str1==str3.intern():" + (str1 == str3.intern()));
        System.out.println("str2==str3.intern():" + (str2 == str3.intern()));

        String str4 = new String("计算机");
        System.out.println("str3==str4:" + (str3 == str4));
        System.out.println("str3.intern()==str4.intern():" + (str3.intern() == str4.intern()));


        String str5 = new StringBuilder("软件").append("工程").toString();
        System.out.println("str5.intern() == str5:" + (str5.intern() == str5));

        String str6 = new String(new StringBuilder("物联网").append("工程").toString());
        System.out.println("str6.intern() == str6:" + (str6.intern() == str6));

        String str7 = new String("物联网");
        System.out.println("str7.intern() == str7:" + (str7.intern() == str7));


        String s8 = new String("1") + new String("1");
        System.out.println("s8.intern()==s8:"+(s8.intern()==s8));

      /*  ---------------------
                作者：幕涩
        来源：CSDN
        原文：https://blog.csdn.net/guoxiaolongonly/article/details/80425548
        版权声明：本文为博主原创文章，转载请附上博文链接！*/
    }
}
