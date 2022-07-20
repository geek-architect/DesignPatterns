package com.geekarchitect.patterns.prototype.demo02;

import lombok.Data;

/**
 * 商品SKU
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
@Data
public class SKU011 implements Cloneable {
    private String id;
    private String name;
    private int quantity;

    public SKU011() {
    }

    public SKU011(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
