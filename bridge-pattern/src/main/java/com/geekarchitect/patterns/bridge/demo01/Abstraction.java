package com.geekarchitect.patterns.bridge.demo01;

/**
 * 抽象对象角色抽象类
 *
 * @author 极客架构师@吴念
 * @createTime 2023/3/28
 */
public abstract class Abstraction {
    /**
     * 桥接点
     */
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImpl();
    }
}
