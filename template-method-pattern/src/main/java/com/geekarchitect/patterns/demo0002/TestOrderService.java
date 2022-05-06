package com.geekarchitect.patterns.demo0002;

/**
 * 测试类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/3
 */
public class TestOrderService {

    public static void main(String[] args) {
        TestOrderService testOrderService = new TestOrderService();
        //testOrderService.bjMobileTest();
        testOrderService.sxUnicomTest();
    }

    public void bjMobileTest() {
        IOrderSerivce orderSerivce = new BjMobileOrderService();
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setMemberID("1");
        orderInfo.setMemberName("张三");
        orderInfo.setMobileNumber("18702222387");
        orderInfo.setMemberIdentityCard("142724000000003310");
        orderInfo.setOperatorName("北京移动");
        orderSerivce.createOrder(orderInfo);
    }

    public void sxUnicomTest() {
        IOrderSerivce orderSerivce = new SxUnicomOrderService();
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setMemberID("2");
        orderInfo.setMemberName("李四");
        orderInfo.setMobileNumber("18702222000");
        orderInfo.setMemberIdentityCard("142724000000003311");
        orderInfo.setOperatorName("山西联通");
        orderSerivce.createOrder(orderInfo);
    }
}
