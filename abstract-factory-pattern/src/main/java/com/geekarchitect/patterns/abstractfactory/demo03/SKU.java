package com.geekarchitect.patterns.abstractfactory.demo03;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
@Data
public class SKU implements Serializable {
    private Long Id;
    private String name;
    private Long firstCategoryId;
    private String firstCategoryName;
    private Long secondCategoryId;
    private String secondCategoryName;
    private Long thirdCategoryId;
    private String thirdCategoryName;
    private BigDecimal price;
    private Long shopId;
    private String shopName;
    private int sales;//销售量
    private int stock;//库存量
}
