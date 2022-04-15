package com.geekarchitect.patterns.demo9901;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 基于策略模式
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public class SetlementService implements ISettlementService {

    private static final Logger LOG = LoggerFactory.getLogger(SetlementService.class);

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
        LOG.info("第五版代码：基于策略模式+模板方法模式");
        BigDecimal total = new BigDecimal(0);
        for (CartItem cartItem : cart.getCartItemList()
        ) {
            total = total.add(promotion(cartItem, cart.getMember()));
        }
        LOG.info("订单总价格：{}", total.doubleValue());
    }
}
