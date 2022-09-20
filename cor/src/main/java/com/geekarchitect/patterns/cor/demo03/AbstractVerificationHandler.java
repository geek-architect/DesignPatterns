package com.geekarchitect.patterns.cor.demo03;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
public abstract class AbstractVerificationHandler implements IVerificationHandler {
    private IVerificationHandler successor;

    /**
     * 模板方法
     * 链式处理请求
     *
     * @param request
     * @return
     */
    @Override
    public final Response handleRequest(Request request) {
        Response response = doHandle(request);
        if (!response.getIsOk()) {
            return response;
        } else if (this.successor != null) {
            response = this.successor.handleRequest(request);
        }
        return response;
    }


    /**
     * 处理该请求
     *
     * @param request
     * @return
     */
    protected abstract Response doHandle(Request request);

    @Override
    public void setSuccessor(IVerificationHandler successor) {
        this.successor = successor;
    }
}
