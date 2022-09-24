package com.geekarchitect.patterns.cor.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请求处理者实现类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/15
 */
public class ConcreteHandlerA extends AbstractHandler {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteHandlerA.class);

    @Override
    protected void doHandle(Request request, Response response) {
        LOG.info("ConcreteHandlerA 处理请求");
    }

    @Override
    protected boolean canHandle(Request request, Response response) {
        return true;
    }

    @Override
    protected boolean isContinue(Request request, Response response) {
        return true;
    }
}
