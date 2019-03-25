package com.example.design.pattern.day21.impl;

/**
 * Invoker
 *
 * @Title: Invoker.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-3-25 10:53
 * @Author 90
 */
public class Invoker {



    /**
     * 调用者持有一个命令对象
     */
    public Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void excuteCommand(){
        command.excute();
    }

    /**
     * 撤销命令
     */
    public void undoCommand(){
        command.unDo();
    }


}
