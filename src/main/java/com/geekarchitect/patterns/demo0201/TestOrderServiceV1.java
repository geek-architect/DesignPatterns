package com.geekarchitect.patterns.demo0201;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class TestOrderServiceV1 {
    private static final Logger LOG = LoggerFactory.getLogger(TestOrderServiceV1.class);

    public static void main(String[] args) {
        LOG.info("第一版代码：普通方式");
        TestOrderServiceV1 testOrderService = new TestOrderServiceV1();
        testOrderService.testPay();
        //testOrderService.testReminder();
    }

    public void testPay() {
        LOG.info("测试支付方法pay()");
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setID("1");
        orderInfo.setOrderStateEnum(OrderStateEnum.UNPAID);
        IOrderService orderService = new OrderServiceV1();
        //第一次支付
        orderService.pay(orderInfo);
        //第二次支付
        orderService.pay(orderInfo);
    }

    public void testReminder() {
        LOG.info("测试催单方法reminder()");
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setID("1");
        orderInfo.setOrderStateEnum(OrderStateEnum.UNPAID);
        IOrderService orderService = new OrderServiceV1();
        //第一次催单
        orderService.reminder(orderInfo);
        //支付
        orderService.pay(orderInfo);
        //第二次催单
        orderService.reminder(orderInfo);
    }
}
