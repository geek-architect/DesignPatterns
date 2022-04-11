package com.geekarchitect.patterns.demo9901;

import lombok.Data;

import java.util.List;

/**
 * 购物车
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
@Data
public class Cart {
    /**
     * 购物项列表
     */
    private List<CartItem> cartItemList;
    /**
     * 会员信息
     */
    private Member member;
}

