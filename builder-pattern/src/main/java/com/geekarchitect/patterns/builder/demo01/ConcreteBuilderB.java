package com.geekarchitect.patterns.builder.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体工厂
 * @author 极客架构师@吴念
 * @createTime 2022/6/27
 */
public class ConcreteBuilderB implements IBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteBuilderB.class);
    private final ConcreteProductB productB = new ConcreteProductB();

    public ConcreteBuilderB() {
    }

    @Override
    public IBuilder buildPartA() {
        LOG.info("partA 特定实现");
        productB.setPartA("partA 特定实现");
        return this;
    }

    @Override
    public IBuilder buildPartB() {
        LOG.info("partB 特定实现");
        productB.setPartA("partB 特定实现");
        return this;
    }

    public ConcreteProductB getProduct() {
        return productB;
    }
}
