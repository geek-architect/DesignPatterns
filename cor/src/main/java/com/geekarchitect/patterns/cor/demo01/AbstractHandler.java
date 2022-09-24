package com.geekarchitect.patterns.cor.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请求处理者抽象类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/15
 */
public abstract class AbstractHandler implements IHandler {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteHandlerB.class);
    private IHandler successor;

    /**
     * 模板方法
     * 链式处理请求
     *
     * @param request
     * @param response
     * @return
     */
    @Override
    public final void handleRequest(Request request, Response response) {
        if (canHandle(request, response)) {
            doHandle(request, response);
        }
        if (isContinue(request, response) && this.successor != null) {
            this.successor.handleRequest(request, response);
        } else {
            LOG.info("请求处理完毕");
        }
    }

    /**
     * 是否可以处理该请求
     *
     * @param request
     * @return
     */
    protected abstract boolean canHandle(Request request, Response response);

    protected abstract boolean isContinue(Request request, Response response);

    /**
     * 处理该请求
     *
     * @param request
     * @return
     */
    protected abstract void doHandle(Request request, Response response);

    @Override
    public void setSuccessor(IHandler successor) {
        this.successor = successor;
    }
}
