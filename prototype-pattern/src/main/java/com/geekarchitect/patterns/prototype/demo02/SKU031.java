package com.geekarchitect.patterns.prototype.demo02;

import lombok.Data;
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.util.List;

/**
 * 商品SKU
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
@Data
public class SKU031 implements Cloneable, Serializable {
    private String id;
    private String name;
    private Integer quantity;
    private List<String> imageList;

    public SKU031() {
    }

    public SKU031(String id, String name, Integer quantity, List<String> imageList) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.imageList = imageList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return SerializationUtils.clone(this);
    }
}
