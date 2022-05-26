package com.geekarchitect.patterns.demo0106;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/5/23
 */
public class TestProductSortDemo1 {
    private static final Logger LOG = LoggerFactory.getLogger(TestProductSortDemo1.class);

    public static void main(String[] args) {
        TestProductSortDemo1 testProductSortDemo1 = new TestProductSortDemo1();
        testProductSortDemo1.sortSKU();
    }

    public void sortSKU() {
        List<SKU> skuList = generateSKU(5);
        LOG.info("List排序方式1：Comparable 接口方式");
        LOG.info("排序前");
        skuList.forEach(e -> {
            LOG.info(e.toString());
        });
        //Collections.sort(skuList);
        skuList.sort(null);
        LOG.info("排序后");
        skuList.forEach(e -> {
            LOG.info(e.toString());
        });
    }

    /**
     * 生成测试数据
     *
     * @param max
     * @return
     */
    public List<SKU> generateSKU(int max) {
        return new ArrayList<SKU>() {
            {
                for (int i = 0; i < max; i++) {
                    add(new SKU("产品" + i, new Random().nextInt(1000)));
                }
            }
        };
    }
}

@Data
class SKU implements Comparable<SKU> {
    private String name;
    private int quantity;

    public SKU(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public SKU() {
    }

    @Override
    public int compareTo(SKU sku) {
        return sku.getQuantity() - this.getQuantity();
    }
}
