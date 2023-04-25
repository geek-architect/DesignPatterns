package com.geekarchitect.patterns.proxy.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 原角色：具体类
 */
public class ConreteOriginal implements IOriginal{
    private static final Logger LOG = LoggerFactory.getLogger(ConreteOriginal.class);
    @Override
    public void service() {
        LOG.info("原角色：service()");
    }
}
