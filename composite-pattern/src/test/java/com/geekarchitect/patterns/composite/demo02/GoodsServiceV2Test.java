package com.geekarchitect.patterns.composite.demo02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoodsServiceV2Test {
    private static final Logger LOG = LoggerFactory.getLogger(GoodsServiceV2Test.class);
    @Autowired
    private IGoodsServiceV2 goodsServiceV2;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void printDetails() {
        LOG.info("第二版代码：所谓的组合模式");
        ICategory branchCategory = generateCategory();
        goodsServiceV2.printDetails(branchCategory);
    }

    private ICategory generateCategory() {
        GoodsBranchCategoryV2 mobileCategory = new GoodsBranchCategoryV2(1, "手机");
        GoodsBranchCategoryV2 mobile5gCategory = new GoodsBranchCategoryV2(11, "5G手机");
        GoodsBranchCategoryV2 gameCategory = new GoodsBranchCategoryV2(12, "游戏手机");
        GoodsLeafCategoryV2 huaWeiMobileCategory = new GoodsLeafCategoryV2(111, "华为手机");

        mobileCategory.add(mobile5gCategory);
        mobileCategory.add(gameCategory);
        mobile5gCategory.add(huaWeiMobileCategory);
        return mobileCategory;
    }
}