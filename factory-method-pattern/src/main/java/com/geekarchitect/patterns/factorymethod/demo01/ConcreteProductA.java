package com.geekarchitect.patterns.factorymethod.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体产品
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class ConcreteProductA implements IProduct {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteProductA.class);

    @Override
    public void doService() {
        LOG.info("具体产品：ConcreteProductA 提供服务");
    }
}
