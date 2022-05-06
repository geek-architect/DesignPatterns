package com.geekarchitect.patterns.demo0101;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品SKU
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
@Data
public class SKU {

    private String name;
    private BigDecimal price;
    private PromotionStrategyEnum promotionStrategy;
    private String id;

    public SKU() {
    }

    public SKU(String name, BigDecimal price, PromotionStrategyEnum promotionStrategy, String id) {
        this.name = name;
        this.price = price;
        this.promotionStrategy = promotionStrategy;
        this.id = id;
    }
}
