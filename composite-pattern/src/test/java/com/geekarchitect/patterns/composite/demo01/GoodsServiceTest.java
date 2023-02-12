package com.geekarchitect.patterns.composite.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoodsServiceTest {
    private static final Logger LOG = LoggerFactory.getLogger(GoodsServiceTest.class);
    @Autowired
    private IGoodsService goodsService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void printDetails() {
        LOG.info("第一版代码：无设计模式");
        IBranchCategory branchCategory = generateCategory();
        goodsService.printDetails(branchCategory);
    }

    private IBranchCategory generateCategory() {
        IBranchCategory mobileCategory = new GoodsBranchCategory(1, "手机");
        IBranchCategory mobile5gCategory = new GoodsBranchCategory(11, "5G手机");
        IBranchCategory gameCategory = new GoodsBranchCategory(12, "游戏手机");
        ILeafCategory huaWeiMobileCategory = new GoodsLeafCategory(111, "华为手机");

        mobileCategory.add(mobile5gCategory);
        mobileCategory.add(gameCategory);
        mobile5gCategory.add(huaWeiMobileCategory);
        return mobileCategory;
    }
}