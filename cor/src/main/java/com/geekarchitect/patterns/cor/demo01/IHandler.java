package com.geekarchitect.patterns.cor.demo01;

/**
 * 请求处理者角色接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/15
 */
public interface IHandler {
    void handleRequest(Request request, Response response);

    void setSuccessor(IHandler requestHandlerRole);
}
