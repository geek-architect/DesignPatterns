package com.geekarchitect.patterns.singleton.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/5/30
 */
public class TestLocalCacheManagerV02 {
    private static final Logger LOG = LoggerFactory.getLogger(TestLocalCacheManagerV02.class);

    public static void main(String[] args) {
        TestLocalCacheManagerV02 testLocalCacheManager = new TestLocalCacheManagerV02();
        testLocalCacheManager.demo01();
    }

    public void demo01() {
        LocalCacheManagerV21 localCacheManagerV2101 = LocalCacheManagerV21.getInstance();
        LocalCacheManagerV21 localCacheManagerV2102 = LocalCacheManagerV21.getInstance();
        localCacheManagerV2101.put("1", "北京");
        LOG.info("localCacheManagerV2101 == localCacheManagerV2102 is {}", (localCacheManagerV2101 == localCacheManagerV2102));
        LOG.info("localCacheManagerV2101.get('1')={} ", (localCacheManagerV2101.get("1")));
        LOG.info("localCacheManagerV2102.get('2')={} ", (localCacheManagerV2102.get("1")));
    }
    public void demo02() {
        LocalCacheManagerV22 localCacheManagerV2201 = LocalCacheManagerV22.getInstance();
        LocalCacheManagerV22 localCacheManagerV2202 = LocalCacheManagerV22.getInstance();
        localCacheManagerV2201.put("1", "北京");
        LOG.info("localCacheManagerV2201 == localCacheManagerV2202 is {}", (localCacheManagerV2201 == localCacheManagerV2202));
        LOG.info("localCacheManagerV2201.get('1')={} ", (localCacheManagerV2201.get("1")));
        LOG.info("localCacheManagerV2202.get('2')={} ", (localCacheManagerV2202.get("1")));
    }
}
