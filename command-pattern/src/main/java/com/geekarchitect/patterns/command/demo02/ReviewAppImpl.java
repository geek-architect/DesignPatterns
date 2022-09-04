package com.geekarchitect.patterns.command.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/8/29
 */
@Component("reviewApp")
public class ReviewAppImpl implements IAppClient {
    private static final Logger LOG = LoggerFactory.getLogger(ReviewAppImpl.class);

    public void offline() {
        LOG.info("RPC层");
        LOG.info("下线商品评价应用");
    }
}
