package com.geekarchitect.patterns.factorymethod.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体工厂：用于生产ConcreteProductB产品
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class ConcreteFactoryB extends AbstractFactory {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteFactoryB.class);

    public IProduct createProduct() {
        LOG.info("具体工厂：用于生产ConcreteProductB产品");
        return new ConcreteProductB();
    }
}
