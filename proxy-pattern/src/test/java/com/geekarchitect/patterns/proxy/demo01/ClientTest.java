package com.geekarchitect.patterns.proxy.demo01;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private static final Logger LOG = LoggerFactory.getLogger(ClientTest.class);
    private Client client;
    @Test
    void service() {
        LOG.info("代理器模式通用代码");
        IOriginal original=new ConreteOriginal();
        IOriginal proxy=new ConcreteProxyA(original);
        client=new Client();
        client.setOriginal(proxy);
        client.service();
    }
}