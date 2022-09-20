package com.geekarchitect.patterns.cor.demo03;


/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
public interface IVerificationHandler {
    Response handleRequest(Request request);

    void setSuccessor(IVerificationHandler verificationHandler);
}
