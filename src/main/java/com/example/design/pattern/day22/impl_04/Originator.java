package com.example.design.pattern.day22.impl_04;

/**
 * Originator
 *
 * @Title: Originator.java
 * @Copyright: Copyright (c) 2005
 * @Description: 由于“自述历史”作为备忘录模式的一个特殊表现形式非常简单易懂，它可能是最为流行的实现形式
 * @Company: 互动百科
 * @Created on 2019-3-26 14:47
 * @Author 90
 */
public class Originator {

    public String state;

    /**
     * 改变状态
     * @param state
     */
    public void changeState(String state){
        this.state=state;
        System.out.println("状态改变为："+this.state);
    }

    /**
     * 工厂方法，返还一个新的备忘录对象
     */
    public Memento createMemento(){
        return new Memento(this);
    }
    /**
     * 将发起人恢复到备忘录对象所记录的状态上
     */
    public void restoreMemento(MementoIF memento){
        Memento m = (Memento)memento;
        changeState(m.state);
    }


    private class Memento  implements MementoIF{

        private String state;

        /**
         * 构造方法
         */
        private Memento(Originator o){
            this.state=o.state;
        }

        private String getState(){
            return state;
        }


    }

}
