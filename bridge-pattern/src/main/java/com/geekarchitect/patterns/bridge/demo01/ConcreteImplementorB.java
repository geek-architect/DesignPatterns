package com.geekarchitect.patterns.bridge.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体对象角色实现类
 *
 * @author 极客架构师@吴念
 * @createTime 2023/3/28
 */
public class ConcreteImplementorB implements Implementor {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteImplementorB.class);

    @Override
    public void operationImpl() {
        LOG.info("具体实现对象：ConcreteImplementorB operationImpl()");
    }
}
