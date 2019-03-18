package com.example.design.pattern.day14.impl.desin;

import java.io.File;

/**
 * Test
 *
 * @Title: Test.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 16:43
 * @Author 90
 */
public class Test {

    public static void createTree(Node node) throws Exception{
        File file = new File(node.name);
        File[] f = file.listFiles();
        for(File fi : f){
            if(fi.isFile()){
                Filer filer = new Filer(fi.getAbsolutePath());
                node.addNode(filer);
            }
            if(fi.isDirectory()){
                Noder noder = new Noder(fi.getAbsolutePath());
                node.addNode(noder);
                //使用递归生成树结构
                createTree(noder);
            }
        }
    }
    public static void main(String[] args) {
        Node noder = new Noder("E:/GitLab/design/src");
        try {
            createTree(noder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        noder.display();
    }

}
