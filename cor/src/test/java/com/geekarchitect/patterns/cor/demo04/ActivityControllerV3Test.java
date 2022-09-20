package com.geekarchitect.patterns.cor.demo04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ActivityControllerV3Test {
    private static final Logger LOG = LoggerFactory.getLogger(ActivityControllerV3Test.class);
    @Autowired
    private ActivityControllerV3 activityControllerV3;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void verification() {
        LOG.info("第三版代码:基于apache-commons-chain");
        Long memberId=new Random().nextLong();
        Long activityId=new Random().nextLong();
        activityControllerV3.verification(memberId,activityId);
    }
}