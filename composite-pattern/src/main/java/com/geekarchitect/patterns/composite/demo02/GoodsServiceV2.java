package com.geekarchitect.patterns.composite.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/8
 */
@Service
public class GoodsServiceV2 implements IGoodsServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(GoodsServiceV2.class);

    @Override
    public void printDetails(ICategory category) {
        LOG.info(category.getDetails());
    }
}
