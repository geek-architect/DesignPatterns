package com.geekarchitect.patterns.demo0101;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/4/2
 */
public class TestSettlementService {
    public static void main(String[] args) {
        TestSettlementService testSettlementService = new TestSettlementService();
        Cart cart = testSettlementService.mockCart();

        ISettlementService settlementService = new SetlementServiceV1();
        //ISettlementService settlementService=new SetlementServiceV2();
        //ISettlementService settlementService=new SetlementServiceV3();
        //ISettlementService settlementService=new SetlementServiceV4();
        settlementService.settlement(cart);
        //StrategyClientRole strategyClientRole=new StrategyClientRole();
        //strategyClientRole.clientMethod();
    }

    public Cart mockCart() {
        Cart cart = new Cart();

        CartItem cartItem01 = new CartItem();
        cartItem01.setSku(new SKU("华为手机", new BigDecimal(6000), PromotionStrategyEnum.BUY_MORE, "1"));
        cartItem01.setQuantity(10);
        CartItem cartItem02 = new CartItem();
        cartItem02.setSku(new SKU("小米手机", new BigDecimal(5000), PromotionStrategyEnum.CASH_BACK, "2"));
        cartItem02.setQuantity(20);
        CartItem cartItem03 = new CartItem();
        cartItem03.setSku(new SKU("三星手机", new BigDecimal(7000), PromotionStrategyEnum.NONE, "3"));
        cartItem03.setQuantity(20);
        List<CartItem> cartItemList = new ArrayList();
        cartItemList.add(cartItem01);
        cartItemList.add(cartItem02);
        cartItemList.add(cartItem03);
        cart.setCartItemList(cartItemList);

        Member member = new Member(1L, "码农老吴", true);
        cart.setMember(member);

        return cart;
    }
}
