package com.geekarchitect.patterns.demo0106;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/5/23
 */
public class TestProductSortDemo3 {
    private static final Logger LOG = LoggerFactory.getLogger(TestProductSortDemo1.class);

    public static void main(String[] args) {
        TestProductSortDemo3 testProductSortDemo3 = new TestProductSortDemo3();
        testProductSortDemo3.sortSPU();
    }

    public void sortSPU() {
        List<SPU> spuList = generateSPU(5);
        LOG.info("List排序方式3：流方式");
        LOG.info("排序前");
        spuList.forEach(e -> {
            LOG.info(e.toString());
        });
        spuList = spuList.stream().sorted(Comparator.comparing(SPU::getQuantity)).collect(Collectors.toList());
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