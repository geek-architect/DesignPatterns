package com.geekarchitect.patterns.abstractfactory.demo02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public abstract class AbstractTest {
    public List<SKU> generateSku(int max) {
        List<SKU> skuList = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            SKU sku = new SKU();
            sku.setId(Long.valueOf(i));
            sku.setName("商品" + i);
            sku.setFirstCategoryId(Long.valueOf(i));
            sku.setFirstCategoryName("一级类目：" + i);
            sku.setSecondCategoryId(Long.valueOf(i));
            sku.setSecondCategoryName("二级类目：" + i);
            sku.setThirdCategoryId(Long.valueOf(i));
            sku.setThirdCategoryName("三级类目：" + i);
            sku.setPrice(new BigDecimal(i));
            sku.setSales(i);
            sku.setStock(i);
            skuList.add(sku);
        }
        return skuList;
    }
}
