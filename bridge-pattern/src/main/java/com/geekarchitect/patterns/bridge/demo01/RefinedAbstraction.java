package com.geekarchitect.patterns.bridge.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 扩展的抽象对象角色具体类
 *
 * @author 极客架构师@吴念
 * @createTime 2023/3/28
 */
public class RefinedAbstraction extends Abstraction {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteImplementorA.class);

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void refinedOperation() {
        LOG.info("扩展的抽象对象：refinedOperation()");
    }
}
