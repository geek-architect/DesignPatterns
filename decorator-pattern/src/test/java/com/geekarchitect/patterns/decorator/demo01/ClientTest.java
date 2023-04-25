package com.geekarchitect.patterns.decorator.demo01;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private static final Logger LOG = LoggerFactory.getLogger(ClientTest.class);
    private Client client;
    @Test
    void service() {
        LOG.info("装饰器模式通用代码");
        IOriginal original=new ConreteOriginal();
        IOriginal decorator=new ConcreteDecoratorA(original);
        client=new Client();
        client.setOriginal(decorator);
        client.service();
    }
}