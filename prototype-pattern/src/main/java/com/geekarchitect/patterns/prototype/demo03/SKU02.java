package com.geekarchitect.patterns.prototype.demo03;

import lombok.Data;
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

/**
 * 商品SKU
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
@Data
public class SKU02 implements Cloneable, Serializable {
    private String id;
    private String name;
    private transient Integer quantity;

    public SKU02() {
    }

    public SKU02(String id, String name, Integer quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return SerializationUtils.clone(this);
    }
}
