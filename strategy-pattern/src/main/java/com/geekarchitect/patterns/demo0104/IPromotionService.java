package com.geekarchitect.patterns.demo0104;

import com.geekarchitect.patterns.demo0101.CartItem;
import com.geekarchitect.patterns.demo0101.Member;
import com.geekarchitect.patterns.demo0103.IPromotionStrategy;

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
