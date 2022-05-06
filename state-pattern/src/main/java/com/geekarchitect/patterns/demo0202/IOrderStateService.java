package com.geekarchitect.patterns.demo0202;

import com.geekarchitect.patterns.demo0201.OrderInfo;

/**
 * 订单状态服务接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public interface IOrderStateService {
    /**
     * 支付
     * @author: 极客架构师@吴念
     * @date: 2022/4/15
     * @param: [orderID]
     * @return: void
     */
    boolean pay(OrderInfo orderInfo);

    /**
     * 催单
     *
     * @author: 极客架构师@吴念
     * @date: 2022/4/15
     * @param: [orderID, message]
     * @return: void
     */
    boolean reminder(OrderInfo orderInfo);

    /**
     * 删除订单
     *
     * @author: 极客架构师@吴念
     * @date: 2022/4/15
     * @param: [OrderID]
     * @return: boolean
     */
    boolean delete(OrderInfo orderInfo);


}
