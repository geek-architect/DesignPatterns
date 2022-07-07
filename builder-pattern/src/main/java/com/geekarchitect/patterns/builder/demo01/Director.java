package com.geekarchitect.patterns.builder.demo01;

/**
 * 导演类
 * @author 极客架构师@吴念
 * @createTime 2022/6/27
 */
public class Director {
    private final IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public ConcreteProductA constructProductA() {
        if (null != this.builder && this.builder instanceof ConcreteBuilderA) {
            return ((ConcreteBuilderA) builder.buildPartA().buildPartB()).getProduct();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public ConcreteProductB constructProductB() {
        if (null != this.builder && this.builder instanceof ConcreteBuilderB) {
            return ((ConcreteBuilderB) builder.buildPartA().buildPartB()).getProduct();
        } else {
            throw new UnsupportedOperationException();
        }
    }

}
