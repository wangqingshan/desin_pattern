package com.example.design.pattern.day14.impl.desin;

/**
 * Node
 *
 * @Title: Node.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-18 16:22
 * @Author 90
 */
public abstract class Node {
    protected String name;


    public Node(String name){
        this.name=name;
    }

    /**
     * 新增节点
     * @param node
     * @throws Exception
     */
    public void addNode(Node node) throws Exception {
        throw new Exception("Invalid exception");
    }

    /**
     * 文件和目录均实现此方法
     */
    public abstract void display();

}
