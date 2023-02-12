package com.geekarchitect.patterns.composite.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/2/8
 */
@Service
public class GoodsService implements IGoodsService {
    private static final Logger LOG = LoggerFactory.getLogger(GoodsService.class);

    @Override
    public void printDetails(IBranchCategory branchCategory) {
        LOG.info(branchCategory.getDetails());
    }
}
