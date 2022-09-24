package com.geekarchitect.patterns.cor.demo01;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 链管理者角色
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/24
 */
@Data
public class Chain {
    private static final Logger LOG = LoggerFactory.getLogger(Chain.class);
    private IHandler firstHandler;

    public Chain() {
        LOG.info("链管理者角色:Chain");
        LOG.info("流程编程，创建链");
        IHandler concreteHandlerA = new ConcreteHandlerA();
        IHandler concreteHandlerB = new ConcreteHandlerB();
        concreteHandlerA.setSuccessor(concreteHandlerB);
        this.firstHandler = concreteHandlerA;
    }
}
