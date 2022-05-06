package com.geekarchitect.patterns.demo9901;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 抽象促销策略类
 * 模板方法模式：模板角色
 * @author 极客架构师@吴念
 * @createTime 2022/4/9
 */
public abstract class AbstractPromotionStrategy implements IPromotionStrategy{
    private static final Logger LOG = LoggerFactory.getLogger(AbstractPromotionStrategy.class);

    /**
     * 计算原价格小计
     * @author: 极客架构师@吴念
     * @date: 2022/4/9
     * @param: [cartItem]
     * @return: java.math.BigDecimal
     */
    public final BigDecimal calcOriginalSubtotal(CartItem cartItem){
        LOG.info("计算原价格小计");
        SKU sku = cartItem.getSku();
        BigDecimal originalSubtotal = sku.getPrice().multiply(new BigDecimal(cartItem.getQuantity()));
        return originalSubtotal;
    }
    /**
     * 根据促销策略计算促销后的小计
     * 模板方法模式：钩子方法
     * @author: 极客架构师@吴念
     * @date: 2022/4/9
     * @param: [cartItem, member, originalSubtotal]
     * @return: java.math.BigDecimal
     */
    public BigDecimal doPromotionalSubtotal(CartItem cartItem, Member member,BigDecimal originalSubtotal){
        LOG.info("根据促销策略计算促销后的小计");
        return originalSubtotal;
    }

    /**
     * 模板方法模式：模板方法
     * @author: 极客架构师@吴念
     * @date: 2022/4/9
     * @param: [cartItem, member]
     * @return: java.math.BigDecimal
     */
    @Override
    public final  BigDecimal calculate(CartItem cartItem, Member member) {
        BigDecimal originalSubtotal =calcOriginalSubtotal(cartItem);
        BigDecimal promotionalSubtotal=doPromotionalSubtotal(cartItem,member,originalSubtotal);
        LOG.info("促销方式：{}，SKU名称：{} 原小计：{},促销后小计：{}",cartItem.getSku().getPromotionStrategy().getName(), cartItem.getSku().getName(), originalSubtotal, promotionalSubtotal);
        return promotionalSubtotal;
    }
}
