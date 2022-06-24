package com.geekarchitect.patterns.factorymethod.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 客户方角色
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class ClientRole {
    private static final Logger LOG = LoggerFactory.getLogger(ClientRole.class);

    public void service() {
        LOG.info("客户方角色：提供服务");
        IFactory factory = new ConcreteFactoryA();
        IProduct product = factory.createProduct();
        product.doService();

        factory = new ConcreteFactoryB();
        product = factory.createProduct();
        product.doService();
    }
}
