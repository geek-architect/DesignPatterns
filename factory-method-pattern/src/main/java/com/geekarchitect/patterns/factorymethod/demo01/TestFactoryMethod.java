package com.geekarchitect.patterns.factorymethod.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/22
 */
public class TestFactoryMethod {
    private static final Logger LOG = LoggerFactory.getLogger(TestFactoryMethod.class);

    public static void main(String[] args) {
        TestFactoryMethod testFactoryMethod = new TestFactoryMethod();
        testFactoryMethod.demo01();
    }

    public void demo01() {
        LOG.info("工厂方法模式-通用代码-普通形态");
        ClientRole clientRole = new ClientRole();
        clientRole.service();
    }
}
