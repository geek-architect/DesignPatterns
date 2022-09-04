package com.geekarchitect.patterns.command.demo03;

import com.geekarchitect.patterns.command.demo02.AppCodeEnum;
import com.geekarchitect.patterns.command.demo02.RecommendAppImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DegradeControllerV2Test {
    private static final Logger LOG = LoggerFactory.getLogger(DegradeControllerV2Test.class);
    @Autowired
    private DegradeControllerV2 degradeControllerV2;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void offline() {
        LOG.info("第二版代码：命令模式,简版");
        degradeControllerV2.offline(AppCodeEnum.REVIEW.getCode());
    }
}