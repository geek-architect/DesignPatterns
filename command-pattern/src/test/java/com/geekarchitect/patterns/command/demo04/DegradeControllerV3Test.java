package com.geekarchitect.patterns.command.demo04;

import com.geekarchitect.patterns.command.demo02.AppCodeEnum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DegradeControllerV3Test {
    private static final Logger LOG = LoggerFactory.getLogger(DegradeControllerV3Test.class);
    @Autowired
    private DegradeControllerV3 degradeControllerV3;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void offline() {
        LOG.info("第三版代码：完整的命令模式");
        degradeControllerV3.offline(AppCodeEnum.REVIEW.getCode());
        try {
            LOG.info("等待中... ");
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}