package com.geekarchitect.patterns.observer.demo03;

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
class OrderServiceV3ObservableTest {
    static final Logger LOG = LoggerFactory.getLogger(OrderServiceV3ObservableTest.class);
    @Autowired
    private OrderServiceV3Observable orderServiceV3Observable;

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
        LOG.info("第三版代码：基于JDK中的观察者模块");
        orderServiceV3Observable.pay(orderInfo);
    }
}