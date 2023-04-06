package com.geekarchitect.patterns.adapter.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ClientTest {
    private static final Logger LOG = LoggerFactory.getLogger(ClientTest.class);

    private Client client;

    @BeforeEach
    void setUp() {
        client=new Client();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void service01() {
        LOG.info("适配器模式-对象适配器");
        IAdaptee adaptee=new AdapteeA();
        ITarget target=new AdapterA(adaptee);
        target.service();
    }
    @Test
    void service02() {
        LOG.info("适配器模式-类适配器");
        ITarget target=new AdapterB();
        target.service();
    }
}