package com.geekarchitect.patterns.builder.demo04;

import com.geekarchitect.patterns.builder.demo03.TestCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/7/6
 */
public class TestMyCache {
    private static final Logger LOG = LoggerFactory.getLogger(TestMyCache.class);
    public static void main(String[] args) {
        TestMyCache testMyCache=new TestMyCache();
        testMyCache.demo01();
    }

    public void demo01() {
        MyCache<String, String> myCache = new MyCache.MyCacheBuilder(10, 100L)
                .setConcurrencyLevel(20)
                .setMaximumWeight(30L)
                .build();
        LOG.info(myCache.toString());
    }
}
