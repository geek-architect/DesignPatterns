package com.geekarchitect.patterns.demo0103;

import com.geekarchitect.patterns.demo0101.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 促销策略：满减
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public class CachBackPromotionStrategy implements IPromotionStrategy {
    private static final Logger LOG = LoggerFactory.getLogger(CachBackPromotionStrategy.class);

    @Override
    public BigDecimal calculate(CartItem cartItem, Member member) {
        SKU sku = cartItem.getSku();
        BigDecimal originalSubtotal = sku.getPrice().multiply(new BigDecimal(cartItem.getQuantity()));
        //此处省略几百行代码
        BigDecimal promotionalSubtotal = Utils.random(originalSubtotal);
        LOG.info("促销方式：满减，SKU名称：{} 原小计：{},促销后小计：{}", sku.getName(), originalSubtotal, promotionalSubtotal);
        return promotionalSubtotal;
    }
}
