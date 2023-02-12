package com.geekarchitect.patterns.composite.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/8
 */
@Service
public class GoodsServiceV3 implements IGoodsServiceV3 {
    private static final Logger LOG = LoggerFactory.getLogger(GoodsServiceV3.class);

    @Override
    public void printDetails(ICategoryV3 category) {
        LOG.info(category.getDetails());
    }
}
