package com.geekarchitect.patterns.demo9901;

import java.math.BigDecimal;

/**
 * 促销策略接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public interface IPromotionStrategy {
    /**
     * 计算促销金额
     *
     * @author: 极客架构师@吴念
     * @date: 2022/3/26
     * @param:
     * @return:
     */
    BigDecimal calculate(CartItem cartItem, Member member);
}
