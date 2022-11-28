package com.geekarchitect.patterns.observer.demo01;

import lombok.Data;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/17
 */
@Data
public class OrderInfo {
    private Long ID;
    private Long MemberID;
    private int orderType;
}
