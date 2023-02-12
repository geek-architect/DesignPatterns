package com.geekarchitect.patterns.composite.demo03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoodsServiceV3Test {
    private static final Logger LOG = LoggerFactory.getLogger(GoodsServiceV3Test.class);
    @Autowired
    private IGoodsServiceV3 goodsServiceV3;


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void printDetails() {
        LOG.info("第三版代码：项目实战中的解决方案");
        ICategoryV3 branchCategory = generateCategory();
        goodsServiceV3.printDetails(branchCategory);
    }

    private ICategoryV3 generateCategory() {
        ICategoryV3 mobileCategory = new GoodsCategoryV3(1, "手机");
        ICategoryV3 mobile5gCategory = new GoodsCategoryV3(11, "5G手机");
        ICategoryV3 gameCategory = new GoodsCategoryV3(12, "游戏手机");
        ICategoryV3 huaWeiMobileCategory = new GoodsCategoryV3(111, "华为手机");

        mobileCategory.add(mobile5gCategory);
        mobileCategory.add(gameCategory);
        mobile5gCategory.add(huaWeiMobileCategory);
        return mobileCategory;
    }
}