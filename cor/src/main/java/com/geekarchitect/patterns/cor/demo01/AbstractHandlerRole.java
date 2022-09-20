package com.geekarchitect.patterns.cor.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/15
 */
public abstract class AbstractHandlerRole implements IHandlerRole {
    private IHandlerRole successor;

    /**
     * 模板方法
     * 链式处理请求
     *
     * @param request
     * @return
     */
    @Override
    public final Response handleRequest(Request request) {
        Response response = null;
        if (canHandle(request)) {
            response = doHandle(request);
        } else {
            if (this.successor != null) {
                response = this.successor.handleRequest(request);
            }
        }
        return response;
    }

    /**
     * 是否可以处理该请求
     *
     * @param request
     * @return
     */
    protected boolean canHandle(Request request) {
        return false;
    }

    /**
     * 处理该请求
     *
     * @param request
     * @return
     */
    protected abstract Response doHandle(Request request);

    @Override
    public void setSuccessor(IHandlerRole successor) {
        this.successor = successor;
    }
}
