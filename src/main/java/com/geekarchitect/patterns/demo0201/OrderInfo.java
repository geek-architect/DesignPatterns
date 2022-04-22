package com.geekarchitect.patterns.demo0201;

import lombok.Data;

/**
 * 订单信息
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/16
 */
@Data
public class OrderInfo {
    /**
     * 订单id
     */
    private String ID;
    /**
     * 订单状态
     */
    private OrderStateEnum orderStateEnum;

}
