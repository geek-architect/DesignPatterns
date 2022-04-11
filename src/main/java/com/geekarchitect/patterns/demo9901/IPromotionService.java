package com.geekarchitect.patterns.demo9901;


import java.math.BigDecimal;

/**
 * 促销服务接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public interface IPromotionService {
    BigDecimal doCalculate(CartItem cartItem, Member member);

    IPromotionStrategy getPromotionStrategy();

    void setPromotionStrategy(IPromotionStrategy promotionStrategy);
}
