package com.example.design.pattern.day14.impl.withoutdesin;

import java.util.ArrayList;
import java.util.List;

/**
 * Noder
 *
 * @Title: Noder.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 16:03
 * @Author 90
 */
public class Noder {
    String nodeName;

    public Noder(String nodeName){
        this.nodeName=nodeName;
    }
    List<Noder> noderList=new ArrayList<Noder>();
    List<Filer> filerList=new ArrayList<Filer>();

    /**
     * 增加下级目录
     * @param noder
     */
    public void addNoder(Noder noder){
        noderList.add(noder);
    }

    public void addFiler(Filer filer){
        filerList.add(filer);
    }

    /**
     * 显示下级目录以及文件
     */
    public void display(){

        for(Noder noder:noderList){
            System.out.println(noder.nodeName);
            noder.display();//递归显示目录列表
        }
        for (Filer filer:filerList){
            filer.display();
        }
    }

}
