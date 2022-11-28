package com.geekarchitect.patterns.observer.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceTest {
    static final Logger LOG = LoggerFactory.getLogger(OrderServiceTest.class);
    @Autowired
    private IOrderService orderService;

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
        LOG.info("第一版代码：无设计模式");
        orderService.pay(orderInfo);
    }
}