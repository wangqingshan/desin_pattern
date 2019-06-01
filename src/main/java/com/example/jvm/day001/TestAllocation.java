package com.example.jvm.day001;

/**
 * author 90
 * description 测试虚拟机堆内存分配
 *  -Xms20M -Xmx20M -Xmn10M  -XX:SurvivorRatio=8  -XX:PretenureSizeThreshold=3145728
 * date 2019/5/19
 */
public class TestAllocation {

    private static final int _1MB=1024*1024;

    public static void main(String[] args) {
        //System.out.println(12);
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1=new byte[2*_1MB];
        allocation2=new byte[2*_1MB];
        allocation3=new byte[1*_1MB];
        allocation4=new byte[4*_1MB];
        //PretenureSizeThreshold 指明该对象超过这个大小的时候，直接进入老年代
        /*

        */

































    }
}
