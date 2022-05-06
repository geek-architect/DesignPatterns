package com.geekarchitect.patterns.demo9901;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 促销策略：满减
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public class CashBackPromotionStrategy extends AbstractPromotionStrategy  {
    private static final Logger LOG = LoggerFactory.getLogger(CashBackPromotionStrategy.class);

    @Override
    public BigDecimal doPromotionalSubtotal(CartItem cartItem, Member member,BigDecimal originalSubtotal) {
        LOG.info("根据促销策略计算促销后的小计");
        //此处省略几百行代码
        BigDecimal promotionalSubtotal = Utils.random(originalSubtotal);
        return promotionalSubtotal;
    }
}
