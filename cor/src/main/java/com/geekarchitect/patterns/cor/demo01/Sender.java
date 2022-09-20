package com.geekarchitect.patterns.cor.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/15
 */
public class Sender {
    public void service() {
        ConcreteHandlerA concreteHandlerA = new ConcreteHandlerA();
        ConcreteHandlerB concreteHandlerB = new ConcreteHandlerB();
        concreteHandlerA.setSuccessor(concreteHandlerB);

        Request request = new Request();
        Response response = concreteHandlerA.doHandle(request);
    }
}
