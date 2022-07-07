package com.geekarchitect.patterns.builder.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/7/6
 */
public class TestCache {
    private static final Logger LOG = LoggerFactory.getLogger(TestCache.class);

    public static void main(String[] args) {
        TestCache testCache = new TestCache();
        testCache.demo01();
        testCache.demo02();
        testCache.demo03();
    }

    public void demo01() {
        LOG.info("方案1：超级构造函数");
        ICache<String, String> cache = new CacheImplV1<String, String>(10, 100L, 20, -0L, 0L, 0L);
        LOG.info(cache.toString());
    }

    public void demo02() {
        LOG.info("方案2：重叠构造函数");
        ICache<String, String> cache = new CacheImplV2<String, String>(10, 100L, 20);
        LOG.info(cache.toString());
    }

    public void demo03() {
        LOG.info("方案3：JavaBean方式");
        CacheImplV3<String, String> cache = new CacheImplV3<String, String>(10, 100L);
        cache.setConcurrencyLevel(20);
        LOG.info(cache.toString());
    }
}
