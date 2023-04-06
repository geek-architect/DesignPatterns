package com.geekarchitect.patterns.adapter.demo02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {
    private static final Logger LOG = LoggerFactory.getLogger(PaymentServiceTest.class);

    private PaymentService paymentService;

    @BeforeEach
    void setUp() {
        paymentService=new PaymentService();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pay() {
        PayInfo payInfo=new PayInfo();
        payInfo.setMemberID(1L);
        payInfo.setOrderID(2L);
        payInfo.setPrice(100D);
        payInfo.setPayDate(new Date());

        LOG.info("无适配器");
        IPayment payment=new WeChatPay();
        paymentService.setPayment(payment);
        paymentService.pay(payInfo);

        LOG.info("基于对象适配器");
        AlipayAdapter alipayAdapter=new AlipayAdapter();
        alipayAdapter.setAlipay(new Alipay());
        paymentService.setPayment(alipayAdapter);
        paymentService.pay(payInfo);
    }
}