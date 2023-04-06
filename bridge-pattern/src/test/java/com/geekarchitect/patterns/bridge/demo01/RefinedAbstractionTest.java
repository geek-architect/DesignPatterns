package com.geekarchitect.patterns.bridge.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class RefinedAbstractionTest {

    private static final Logger LOG = LoggerFactory.getLogger(RefinedAbstractionTest.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void refinedOperation() {
        LOG.info("桥模式通用代码-标准版");
        Implementor implementorA=new ConcreteImplementorA();
        RefinedAbstraction refinedAbstraction=new RefinedAbstraction(implementorA);
        refinedAbstraction.operation();
        refinedAbstraction.refinedOperation();
    }
}