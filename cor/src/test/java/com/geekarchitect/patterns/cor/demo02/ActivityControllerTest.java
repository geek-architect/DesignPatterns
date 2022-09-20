package com.geekarchitect.patterns.cor.demo02;

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
class ActivityControllerTest {
    private static final Logger LOG = LoggerFactory.getLogger(ActivityControllerTest.class);
    @Autowired
    private ActivityController activityController;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void verification() {
        LOG.info("第一版代码：无设计模式版");
        Long memberId=new Random().nextLong();
        Long activityId=new Random().nextLong();
        activityController.verification(memberId,activityId);
    }
}