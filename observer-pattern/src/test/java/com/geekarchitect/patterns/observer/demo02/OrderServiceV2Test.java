package com.geekarchitect.patterns.observer.demo02;

import com.geekarchitect.patterns.observer.demo01.OrderInfo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceV2Test {
    static final Logger LOG = LoggerFactory.getLogger(OrderServiceV2Test.class);
    @Autowired
    private IOrderServiceV2 orderServiceV2;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pay() {
        OrderInfo orderInfo=new OrderInfo();
        orderInfo.setID(1L);
        orderInfo.setMemberID(1L);
        orderInfo.setOrderType(100);
        LOG.info("第二版代码：基于观察者模式");
        orderServiceV2.pay(orderInfo);
    }
}