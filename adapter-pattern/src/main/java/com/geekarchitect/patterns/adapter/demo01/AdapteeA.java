package com.geekarchitect.patterns.adapter.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/16
 */
public class AdapteeA implements IAdaptee {
    private static final Logger LOG = LoggerFactory.getLogger(AdapteeA.class);

    @Override
    public void doService() {
        LOG.info("源对象AdapteeA-doService()");
    }
}
