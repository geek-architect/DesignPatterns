package com.geekarchitect.patterns.demo9901;


import java.math.BigDecimal;

/**
 * 促销管理服务接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public class PromotionService implements IPromotionService {
    private IPromotionStrategy promotionStrategy;

    @Override
    public BigDecimal doCalculate(CartItem cartItem, Member member) {
        return promotionStrategy.calculate(cartItem, member);
    }

    @Override
    public IPromotionStrategy getPromotionStrategy() {
        return promotionStrategy;
    }

    @Override
    public void setPromotionStrategy(IPromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
}
