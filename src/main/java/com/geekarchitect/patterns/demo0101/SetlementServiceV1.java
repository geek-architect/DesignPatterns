package com.geekarchitect.patterns.demo0101;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 结算服务
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public class SetlementServiceV1 implements ISettlementService {

    private static final Logger LOG = LoggerFactory.getLogger(SetlementServiceV1.class);

    /**
     * 计算促销价格
     *
     * @author: 极客架构师@吴念
     * @date: 2022/4/1
     * @param:
     * @return:
     */
    private BigDecimal promotion(CartItem cartItem, Member member) {
        SKU sku = cartItem.getSku();
        BigDecimal originalSubtotal = sku.getPrice().multiply(new BigDecimal(cartItem.getQuantity()));
        BigDecimal promotionalSubtotal = new BigDecimal(0);
        switch (sku.getPromotionStrategy()) {
            case CACH_BACK:
                //此处省略几百行代码
                promotionalSubtotal = Utils.random(originalSubtotal);
                LOG.info("促销方式：满减，SKU名称：{} 原小计：{},促销后小计：{}", sku.getName(), originalSubtotal, promotionalSubtotal);
                break;
            case BUY_MORE:
                //此处省略几百行代码
                promotionalSubtotal = Utils.random(originalSubtotal);
                LOG.info("促销方式：多买优惠，SKU名称：{} 原小计：{},促销后小计：{}", sku.getName(), originalSubtotal, promotionalSubtotal);
                break;
            case FOR_PLUS:
                //此处省略几百行代码
                if (member.isPlus()) {
                    promotionalSubtotal = Utils.random(originalSubtotal);
                } else {
                    promotionalSubtotal = originalSubtotal;
                }

                LOG.info("促销方式：plus会员优惠，SKU名称：{} 原小计：{},促销后小计：{}", sku.getName(), originalSubtotal, promotionalSubtotal);
                break;
            case NONE:
                promotionalSubtotal = originalSubtotal;
                LOG.info("促销方式：无，SKU名称：{} 原小计：{},促销后小计：{}", sku.getName(), originalSubtotal, promotionalSubtotal);
        }
        return promotionalSubtotal;
    }

    @Override
    public void settlement(Cart cart) {
        LOG.info("第一版代码：小白级");
        BigDecimal total = new BigDecimal(0);
        for (CartItem cartItem : cart.getCartItemList()
        ) {
            total = total.add(promotion(cartItem, cart.getMember()));
        }
        LOG.info("订单总价格：{}", total.doubleValue());
    }
}
