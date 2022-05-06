package com.geekarchitect.patterns.demo0002;

/**
 * 号卡订单服务
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/3
 */
public interface IOrderSerivce {
    /**
     * 实名认证
     *
     * @author: 极客架构师@吴念
     * @date: 2022/3/3
     * @param: [orderInfo]
     * @return: boolean
     */
    boolean identityVerification(OrderInfo orderInfo);

    /**
     * 一证五号
     *
     * @author: 极客架构师@吴念
     * @date: 2022/3/3
     * @param: [orderInfo]
     * @return: boolean
     */
    boolean fiveCardOnePerson(OrderInfo orderInfo);

    /**
     * 号码锁定
     *
     * @author: 极客架构师@吴念
     * @date: 2022/3/3
     * @param: [orderInfo]
     * @return: boolean
     */
    void lockMobile(OrderInfo orderInfo);

    /**
     * 发送订单信息
     *
     * @author: 极客架构师@吴念
     * @date: 2022/3/3
     * @param:
     * @return:
     */
    boolean sendOrder(OrderInfo orderInfo);

    /**
     * 创建订单
     *
     * @author: 极客架构师@吴念
     * @date: 2022/3/3
     * @param: [orderInfo]
     * @return: boolean
     */
    boolean createOrder(OrderInfo orderInfo);


}
