package com.geekarchitect.patterns.cor.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/15
 */
public class ConcreteHandlerB extends AbstractHandlerRole {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteHandlerB.class);

    @Override
    protected Response doHandle(Request request) {
        LOG.info("ConcreteHandlerB 处理请求");
        return new Response();
    }

    @Override
    protected boolean canHandle(Request request) {
        return new Random().nextBoolean();
    }
}
