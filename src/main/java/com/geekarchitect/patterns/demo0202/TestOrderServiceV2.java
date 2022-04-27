package com.geekarchitect.patterns.demo0202;


import com.geekarchitect.patterns.demo0201.IOrderService;
import com.geekarchitect.patterns.demo0201.OrderInfo;
import com.geekarchitect.patterns.demo0201.OrderStateEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class TestOrderServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(TestOrderServiceV2.class);

    public static void main(String[] args) {
        LOG.info("第二版代码：基于状态模式");
        TestOrderServiceV2 testOrderService = new TestOrderServiceV2();
        testOrderService.testPay();
        //testOrderService.testReminder();
        //testOrderService.testDelete();
    }

    public void testPay() {
        LOG.info("测试支付方法pay()");
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setID("1");
        orderInfo.setOrderStateEnum(OrderStateEnum.UNPAID);
        IOrderService orderService = new OrderServiceV2();
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
        IOrderService orderService = new OrderServiceV2();
        //第一次催单
        orderService.reminder(orderInfo);
        //支付
        orderService.pay(orderInfo);
        //第二次催单
        orderService.reminder(orderInfo);
    }

    public void testDelete() {
        LOG.info("测试删除订单方法delete()");
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setID("1");
        orderInfo.setOrderStateEnum(OrderStateEnum.DONE);
        IOrderService orderService = new OrderServiceV2();
        orderService.delete(orderInfo);
    }
}
