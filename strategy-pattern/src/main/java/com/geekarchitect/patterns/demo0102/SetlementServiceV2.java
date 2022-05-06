package com.geekarchitect.patterns.demo0102;

import com.geekarchitect.patterns.demo0101.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public class SetlementServiceV2 implements ISettlementService {

    private static final Logger LOG = LoggerFactory.getLogger(SetlementServiceV2.class);

    private BigDecimal promotion(CartItem cartItem, Member member) {
        BigDecimal promotionalSubtotal = new BigDecimal(0);
        switch (cartItem.getSku().getPromotionStrategy()) {
            case CASH_BACK:
                promotionalSubtotal = cashBackPromotion(cartItem, member);
                break;
            case BUY_MORE:
                promotionalSubtotal = buyMorePromotion(cartItem, member);
                break;
            case FOR_PLUS:
                promotionalSubtotal = forPlusPromotion(cartItem, member);
                break;
            case NONE:
                promotionalSubtotal = nonePromotion(cartItem, member);
        }
        return promotionalSubtotal;
    }

    /**
     * 满减
     *
     * @author: 极客架构师@吴念
     * @date: 2022/4/1
     * @param: [cart]
     * @return: java.math.BigDecimal
     */
    private BigDecimal cashBackPromotion(CartItem cartItem, Member member) {
        SKU sku = cartItem.getSku();
        BigDecimal originalSubtotal = sku.getPrice().multiply(new BigDecimal(cartItem.getQuantity()));
        //此处省略几百行代码
        BigDecimal promotionalSubtotal = Utils.random(originalSubtotal);
        LOG.info("促销方式：满减，SKU名称：{} 原小计：{},促销后小计：{}", sku.getName(), originalSubtotal, promotionalSubtotal);
        return promotionalSubtotal;
    }

    /**
     * 多买优惠
     *
     * @author: 极客架构师@吴念
     * @date: 2022/4/1
     * @param: [cart]
     * @return: java.math.BigDecimal
     */
    private BigDecimal buyMorePromotion(CartItem cartItem, Member member) {
        SKU sku = cartItem.getSku();
        BigDecimal originalSubtotal = sku.getPrice().multiply(new BigDecimal(cartItem.getQuantity()));
        //此处省略几百行代码
        BigDecimal promotionalSubtotal = Utils.random(originalSubtotal);
        LOG.info("促销方式：多买优惠，SKU名称：{} 原小计：{},促销后小计：{}", sku.getName(), originalSubtotal, promotionalSubtotal);
        return promotionalSubtotal;
    }

    /**
     * plus会员优惠
     *
     * @author: 极客架构师@吴念
     * @date: 2022/4/1
     * @param: [cart]
     * @return: java.math.BigDecimal
     */
    private BigDecimal forPlusPromotion(CartItem cartItem, Member member) {
        SKU sku = cartItem.getSku();
        BigDecimal originalSubtotal = sku.getPrice().multiply(new BigDecimal(cartItem.getQuantity()));
        BigDecimal promotionalSubtotal = new BigDecimal(0);
        //此处省略几百行代码
        if (member.isPlus()) {
            promotionalSubtotal = Utils.random(originalSubtotal);
        } else {
            promotionalSubtotal = originalSubtotal;
        }
        LOG.info("促销方式：plus会员优惠，SKU名称：{} 原小计：{},促销后小计：{}", sku.getName(), originalSubtotal, promotionalSubtotal);
        return promotionalSubtotal;
    }

    private BigDecimal nonePromotion(CartItem cartItem, Member member) {
        SKU sku = cartItem.getSku();
        BigDecimal originalSubtotal = sku.getPrice().multiply(new BigDecimal(cartItem.getQuantity()));
        BigDecimal promotionalSubtotal = originalSubtotal;
        LOG.info("促销方式：plus会员优惠，SKU名称：{} 原小计：{},促销后小计：{}", sku.getName(), originalSubtotal, promotionalSubtotal);
        return promotionalSubtotal;
    }

    @Override
    public void settlement(Cart cart) {
        LOG.info("第二版代码：入门级");
        BigDecimal total = new BigDecimal(0);
        for (CartItem cartItem : cart.getCartItemList()
        ) {
            total = total.add(promotion(cartItem, cart.getMember()));
        }
        LOG.info("订单总价格：{}", total.doubleValue());
    }
}
