package com.geekarchitect.patterns.command.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/8/29
 */
@Component(value = "reviewAppImplV2")
public class ReviewAppImplV2 implements IAppClientV2 {
    private static final Logger LOG = LoggerFactory.getLogger(ReviewAppImplV2.class);

    @Override
    public void offline(Map<String, String> para) {
        LOG.info("RPC层");
        LOG.info("下线商品评价应用");
    }
}
