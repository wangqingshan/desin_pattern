package com.example.design.pattern.day14.impl.withoutdesin;

import java.io.File;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 16:13
 * @Author 90
 */
public class Test {

    public static void createTree(Noder node){
        File file=new File(node.nodeName);
        File[] f=file.listFiles();
        for(File fi:f){
            if(fi.isFile()){
                Filer filer=new Filer(fi.getAbsolutePath());
                node.addFiler(filer);
            }
            if(fi.isDirectory()){
                Noder noder=new Noder(fi.getAbsolutePath());
                node.addNoder(noder);
                //使用递归生成树结构
                createTree(noder);
            }
        }
    }

    public static void main(String[] args) {
        Noder noder=new Noder("E:/GitLab/design/src");
        createTree(noder);
        noder.display();
    }
}
