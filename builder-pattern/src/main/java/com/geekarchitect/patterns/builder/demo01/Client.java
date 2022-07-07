package com.geekarchitect.patterns.builder.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 客户方
 * @author 极客架构师@吴念
 * @createTime 2022/6/27
 */
public class Client {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteBuilderA.class);

    public void demo01() {
        ConcreteBuilderA builder = new ConcreteBuilderA();
        Director director = new Director(builder);
        ConcreteProductA product = director.constructProductA();
        LOG.info(product.toString());
    }

    public void demo02() {
        IBuilder builder = new ConcreteBuilderB();
        Director director = new Director(builder);
        ConcreteProductB product = director.constructProductB();
        LOG.info(product.toString());
    }
}
