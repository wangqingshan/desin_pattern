package com.example.design.pattern.day20.impl;

/**
 * Support
 *
 * @Title: Support.java
 * @Copyright: Copyright (c) 2005
 * @Description: support是个抽象类，他的核心方法support中，如果当前的support可以解决，就解决，否则就交给next去解决。
 * @Company: 互动百科
 * @Created on 2019-3-22 10:33
 * @Author 90
 */
public abstract class Support {

    private String name;
    private Support next;

    public Support(){

    }
    public Support(String name){
        this.name=name;
    }

    /**
     * 核心处理类
     * @param task
     */
    public final void support(Task task){
        if(resolve(task)){
            done(task);
        }else if(next!=null){
            next.support(task);
        }else{
            ignore(task);
        }

    }

    protected abstract boolean resolve(Task task);



    protected void done(Task task){
        System.out.println(task.toString()+" is 处理 by "+this.name+".");
    }

    protected void ignore(Task task){
        System.out.println(task.toString()+" is 忽略 by "+this.name+".");
    }


    /**
     * 组成关联
     * @param next
     * @return
     */
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }


    @Override
    public String toString(){
        return "["+name+"]";
    }
}
