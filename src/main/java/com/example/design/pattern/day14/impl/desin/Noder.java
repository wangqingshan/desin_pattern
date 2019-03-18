package com.example.design.pattern.day14.impl.desin;

import java.util.ArrayList;
import java.util.List;

/**
 * Noder
 *
 * @Title: Noder.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 16:39
 * @Author 90
 */
public class Noder extends Node {


    public Noder(String name) {
        super(name);
    }

    /**
     * 内部节点列表（包括文件和下级目录）
     */
    List<Node> nodeList = new ArrayList<Node>();

    @Override
    public void addNode(Node node) throws Exception {
        nodeList.add(node);
    }

    @Override
    public void display() {
        System.out.println(name);
        for (Node node:nodeList){
            node.display();
        }
    }

}
