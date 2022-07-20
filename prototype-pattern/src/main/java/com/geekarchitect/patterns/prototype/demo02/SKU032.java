package com.geekarchitect.patterns.prototype.demo02;

import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * 商品SKU
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
@Data
public class SKU032 implements Cloneable {
    private String id;
    private String name;
    private Integer quantity;
    private List<String> imageList;

    public SKU032() {
    }

    public SKU032(String id, String name, Integer quantity, List<String> imageList) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.imageList = imageList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        SKU032 dest = new SKU032();
        BeanUtils.copyProperties(this, dest);
        return dest;
    }
}
