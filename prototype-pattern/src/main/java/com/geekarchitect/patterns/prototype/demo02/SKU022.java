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
public class SKU022 {
    private String id;
    private String name;
    private Integer quantity;
    private List<String> imageList;

    public SKU022() {
    }

    public SKU022(String id, String name, Integer quantity, List<String> imageList) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.imageList = imageList;
    }

    public SKU022(SKU022 sku022) {
        this.id = sku022.id;
        this.name = sku022.name;
        this.quantity = sku022.getQuantity();
        List<String> imageList = null;
        if (null == sku022.imageList) {
            imageList = null;
        } else if (sku022.imageList.size() > 0) {
            imageList = new ArrayList<>();
            for (String image : sku022.imageList) {
                imageList.add(image);
            }
        } else {
            imageList = new ArrayList<>();
        }
        this.setImageList(imageList);
    }
}
