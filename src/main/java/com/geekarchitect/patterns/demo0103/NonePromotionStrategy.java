package com.geekarchitect.patterns.demo0103;

import com.geekarchitect.patterns.demo0101.CartItem;
import com.geekarchitect.patterns.demo0101.Member;
import com.geekarchitect.patterns.demo0101.SKU;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 促销策略：满减
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public class NonePromotionStrategy implements IPromotionStrategy {
    private static final Logger LOG = LoggerFactory.getLogger(NonePromotionStrategy.class);

    @Override
    public BigDecimal calculate(CartItem cartItem, Member member) {
        SKU sku = cartItem.getSku();
        BigDecimal originalSubtotal = sku.getPrice().multiply(new BigDecimal(cartItem.getQuantity()));
        BigDecimal promotionalSubtotal = originalSubtotal;
        LOG.info("促销方式：plus会员优惠，SKU名称：{} 原小计：{},促销后小计：{}", sku.getName(), originalSubtotal, promotionalSubtotal);
        return promotionalSubtotal;
    }
}
