package com.geekarchitect.patterns.prototype.demo02;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品SKU
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
@Data
public class SKU021 implements Cloneable {
    private String id;
    private String name;
    private Integer quantity;
    private List<String> imageList;

    public SKU021() {
    }

    public SKU021(String id, String name, Integer quantity, List<String> imageList) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.imageList = imageList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //利用super.clone()浅复制所有属性
        SKU021 sku01 = (SKU021) super.clone();
        //手动处理需要深度复制的属性
        List<String> imageList = null;
        if (null == this.imageList) {
            imageList = null;
        } else if (this.imageList.size() > 0) {
            imageList = new ArrayList<>();
            //注意，如果List里面存放的是别的自定义类，这个类也需要实现深度复制。
            for (String image : this.imageList) {
                imageList.add(image);
            }
        } else {
            imageList = new ArrayList<>();
        }
        sku01.setImageList(imageList);
        return sku01;
    }
}
