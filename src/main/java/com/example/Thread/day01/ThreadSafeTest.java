package com.example.Thread.day01;

/**
 * author 90
 * description 线程安全测试
 * date 2019/4/7
 */
public class ThreadSafeTest {


    public int sharedState;

    public void notSafeTest(){
        while(sharedState<100000){
            int former=sharedState++;
            int latter=sharedState;
            if(former!=latter-1){
                System.out.printf("Observer data race: former:" +former+"  latter:"+latter);
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {

        ThreadSafeTest test=new ThreadSafeTest();
        Thread a=new Thread(){
            public void run(){
                test.notSafeTest();
            }
        };

        Thread b=new Thread(){
            public void run(){
                test.notSafeTest();
            }
        };

        a.start();
        b.start();
        a.join();
        b.join();
    }
}
