package com.geekarchitect.patterns.cor.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/15
 */
public interface IHandlerRole {
    Response handleRequest(Request request);

    void setSuccessor(IHandlerRole requestHandlerRole);
}
