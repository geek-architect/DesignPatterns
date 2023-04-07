package com.geekarchitect.patterns.bridge.demo02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private static final Logger LOG = LoggerFactory.getLogger(ClientTest.class);
    private Client client;

    @BeforeEach
    void setUp() {
        client=new Client();
    }

    @Test
    void service() {
       LOG.info("桥接模式通用代码");
       ISingleDimensionalA singleDimensionalA=new ConcreteSingleDimensionalA();
       IMutiDimensional mutiDimensional=new ConcreteMultiDimensionalA(singleDimensionalA);
       client.setMutiDimensional(mutiDimensional);
       client.service();
    }
}