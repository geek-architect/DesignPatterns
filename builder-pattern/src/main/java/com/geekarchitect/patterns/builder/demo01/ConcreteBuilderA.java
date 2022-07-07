package com.geekarchitect.patterns.builder.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体工厂
 * @author 极客架构师@吴念
 * @createTime 2022/6/27
 */
public class ConcreteBuilderA implements IBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteBuilderA.class);
    private final ConcreteProductA concreteProductA = new ConcreteProductA();

    public ConcreteBuilderA() {

    }

    @Override
    public IBuilder buildPartA() {
        LOG.info("partA 特定实现");
        concreteProductA.setPartA("partA 特定实现");
        return this;
    }

    @Override
    public IBuilder buildPartB() {
        LOG.info("partB 特定实现");
        concreteProductA.setPartB("partB 特定实现");
        return this;
    }

    public ConcreteProductA getProduct() {
        return concreteProductA;
    }


}
