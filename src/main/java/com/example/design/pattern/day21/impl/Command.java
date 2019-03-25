package com.example.design.pattern.day21.impl;

/**
 * Command
 *
 * @Title: Command.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-25 10:47
 * @Author 90
 */
public interface Command {

    /**
     * 执行
     */
    public void excute();

    /**
     * 撤销
     */
    public void unDo();
}
