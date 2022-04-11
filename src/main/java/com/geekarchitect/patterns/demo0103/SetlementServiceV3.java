package com.geekarchitect.patterns.demo0103;

import com.geekarchitect.patterns.demo0101.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 基于面向对象
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public class SetlementServiceV3 implements ISettlementService {

    private static final Logger LOG = LoggerFactory.getLogger(SetlementServiceV3.class);

    private BigDecimal promotion(CartItem cartItem, Member member) {
        BigDecimal subtotal = new BigDecimal(0);
        switch (cartItem.getSku().getPromotionStrategy()) {
            case CACH_BACK:
                subtotal = new CachBackPromotionStrategy().calculate(cartItem, member);
                break;
            case BUY_MORE:
                subtotal = new BuyMorePromotionStrategy().calculate(cartItem, member);
                break;
            case FOR_PLUS:
                subtotal = new ForPlusPromotionStrategy().calculate(cartItem, member);
                break;
            case NONE:
                subtotal = new NonePromotionStrategy().calculate(cartItem, member);
        }
        return subtotal;
    }

    @Override
    public void settlement(Cart cart) {
        LOG.info("第三版代码：面向对象级");
        BigDecimal total = new BigDecimal(0);
        for (CartItem cartItem : cart.getCartItemList()
        ) {
            total = total.add(promotion(cartItem, cart.getMember()));
        }
        LOG.info("订单总价格：{}", total.doubleValue());
    }
}
