package com.geekarchitect.patterns.demo0106;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/5/23
 */
public class TestProductSortDemo2 {
    private static final Logger LOG = LoggerFactory.getLogger(TestProductSortDemo1.class);

    public static void main(String[] args) {
        TestProductSortDemo2 testProductSortDemo2 = new TestProductSortDemo2();
        testProductSortDemo2.sortSPU();
    }

    public void sortSPU() {
        List<SPU> spuList = generateSPU(5);
        LOG.info("List排序方式2：Comparator接口方式");
        LOG.info("排序前");
        spuList.forEach(e -> {
            LOG.info(e.toString());
        });
        Collections.sort(spuList, Comparator.comparingInt(SPU::getQuantity));
        //Collections.sort(SKU2List, (spu1, spu2) -> spu1.getQuantity()-spu2.getQuantity());
        //Collections.sort(SKU2List, Comparator.comparingInt(SPU::getQuantity));

        LOG.info("排序后");
        spuList.forEach(e -> {
            LOG.info(e.toString());
        });
    }

    /**
     * 生成测试数据
     *
     * @param max
     * @return
     */
    public List<SPU> generateSPU(int max) {
        return new ArrayList<SPU>() {
            {
                for (int i = 0; i < max; i++) {
                    add(new SPU("产品" + i, new Random().nextInt(1000)));
                }
            }
        };
    }
}

@Data
class SPU {
    private String name;
    private int quantity;

    public SPU(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public SPU() {
    }
}