package com.geekarchitect.patterns.demo0101;

import lombok.Data;

/**
 * 购物项
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
@Data
public class CartItem {
    private SKU sku;
    private int quantity;
}
