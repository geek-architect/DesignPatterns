package com.geekarchitect.patterns.cor.demo03;

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
class ActivityControllerV2Test {
    private static final Logger LOG = LoggerFactory.getLogger(ActivityControllerV2Test.class);
    @Autowired
    private ActivityControllerV2 activityControllerV2;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void verification() {
        LOG.info("第二版代码：责任链模式版");
        Long memberId=new Random().nextLong();
        Long activityId=new Random().nextLong();
        activityControllerV2.verification(memberId,activityId);
    }
}