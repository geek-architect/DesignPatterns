package com.geekarchitect.patterns.demo0203;


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
public class TestOrderServiceV3 {
    private static final Logger LOG = LoggerFactory.getLogger(TestOrderServiceV3.class);

    public static void main(String[] args) {
        LOG.info("第三版代码：催单方法基于状态模式的二次方");
        TestOrderServiceV3 testOrderService = new TestOrderServiceV3();
        testOrderService.testReminder();
    }

    public void testReminder() {
        LOG.info("测试催单方法reminder()");
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setID("1");
        orderInfo.setOrderStateEnum(OrderStateEnum.UNPAID);
        IOrderService orderService = new OrderServiceV3();
        //第一次催单
        orderService.reminder(orderInfo);
        //支付
        orderService.pay(orderInfo);
        //第二次催单
        orderService.reminder(orderInfo);
        //发货
        orderInfo.setOrderStateEnum(OrderStateEnum.DELIVERED);
        //第三次催单
        orderService.reminder(orderInfo);
    }
}
