package com.geekarchitect.patterns.memento.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/6
 */
public class Caretaker {
    private IMementoRole mementoRole;

    public IMementoRole getMementoRole() {
        return mementoRole;
    }

    public void setMementoRole(IMementoRole mementoRole) {
        this.mementoRole = mementoRole;
    }
}
