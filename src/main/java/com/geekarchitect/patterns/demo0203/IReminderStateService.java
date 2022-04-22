package com.geekarchitect.patterns.demo0203;

import com.geekarchitect.patterns.demo0201.OrderInfo;

/**
 * 特定状态服务方
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public interface IReminderStateService {
    /**
     * 催单
     *
     * @author: 极客架构师@吴念
     * @date: 2022/4/15
     * @param: [orderID, message]
     * @return: void
     */
    boolean reminder(OrderInfo orderInfo);
}
