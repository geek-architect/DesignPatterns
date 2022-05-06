package com.geekarchitect.patterns.demo0104;

import com.geekarchitect.patterns.demo0101.*;
import com.geekarchitect.patterns.demo0103.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 基于策略模式
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public class SetlementServiceV4 implements ISettlementService {

    private static final Logger LOG = LoggerFactory.getLogger(SetlementServiceV4.class);

    private BigDecimal promotion(CartItem cartItem, Member member) {
        BigDecimal subtotal = new BigDecimal(0);
        IPromotionService promotionService = new PromotionService();
        IPromotionStrategy promotionStrategy = null;
        switch (cartItem.getSku().getPromotionStrategy()) {
            case CASH_BACK:
                promotionStrategy = new CashBackPromotionStrategy();
                break;
            case BUY_MORE:
                promotionStrategy = new BuyMorePromotionStrategy();
                break;
            case FOR_PLUS:
                promotionStrategy = new ForPlusPromotionStrategy();
                break;
            default:
                promotionStrategy = new NonePromotionStrategy();
        }
        promotionService.setPromotionStrategy(promotionStrategy);
        subtotal = promotionService.doCalculate(cartItem, member);
        return subtotal;
    }

    @Override
    public void settlement(Cart cart) {
        LOG.info("第四版代码：策略模式级");
        BigDecimal total = new BigDecimal(0);
        for (CartItem cartItem : cart.getCartItemList()
        ) {
            total = total.add(promotion(cartItem, cart.getMember()));
        }
        LOG.info("订单总价格：{}", total.doubleValue());
    }
}
