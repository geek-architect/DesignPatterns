package com.geekarchitect.patterns.prototype.demo02;

import lombok.Data;

/**
 * 商品SKU
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
@Data
public class SKU01 {
    private String id;
    private String name;
    /**
     * 库存数量
     */
    private int quantity;

    public SKU01() {
    }

    public SKU01(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
}
