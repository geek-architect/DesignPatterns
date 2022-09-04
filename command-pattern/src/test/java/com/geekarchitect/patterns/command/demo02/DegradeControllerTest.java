package com.geekarchitect.patterns.command.demo02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DegradeControllerTest {
    private static final Logger LOG = LoggerFactory.getLogger(DegradeControllerTest.class);
    @Autowired
    private DegradeController degradeController;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void offline() {
        LOG.info("第一版代码：未使用设计模式");
        degradeController.offline(AppCodeEnum.REVIEW.getCode());
    }
}