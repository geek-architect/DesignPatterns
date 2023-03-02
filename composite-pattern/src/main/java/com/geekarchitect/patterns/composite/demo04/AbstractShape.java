package com.geekarchitect.patterns.composite.demo04;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/2
 */
public abstract class AbstractShape implements IShape {
    protected String name;

    public AbstractShape(String name) {
        this.name = name;
    }
}
