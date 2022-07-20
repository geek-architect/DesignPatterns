package com.geekarchitect.patterns.prototype.demo02;

import lombok.Data;

import java.util.List;

/**
 * 商品SKU
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
@Data
public class SKU02 implements Cloneable {
    private String id;
    private String name;
    private Integer quantity;
    private List<String> imageList;

    public SKU02() {
    }

    public SKU02(String id, String name, Integer quantity, List<String> imageList) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.imageList = imageList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
