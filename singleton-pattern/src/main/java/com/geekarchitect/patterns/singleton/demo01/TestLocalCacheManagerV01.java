package com.geekarchitect.patterns.singleton.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/5/30
 */
public class TestLocalCacheManagerV01 {
    private static final Logger LOG = LoggerFactory.getLogger(TestLocalCacheManagerV01.class);

    public static void main(String[] args) {
        TestLocalCacheManagerV01 testLocalCacheManagerV01 = new TestLocalCacheManagerV01();
        testLocalCacheManagerV01.demo03();
    }

    public void demo01() {
        LocalCacheManagerV11 localCacheManagerV1101 = LocalCacheManagerV11.getInstance();
        LocalCacheManagerV11 localCacheManagerV1102 = LocalCacheManagerV11.getInstance();
        localCacheManagerV1101.put("1", "北京");
        LOG.info("localCacheManagerV1101 == localCacheManagerV1102 is {}", (localCacheManagerV1101 == localCacheManagerV1102));
        LOG.info("localCacheManagerV1101.get('1')={} ", (localCacheManagerV1101.get("1")));
        LOG.info("localCacheManagerV1102.get('2')={} ", (localCacheManagerV1102.get("1")));

    }

    public void demo02() {
        LocalCacheManagerV12 localCacheManagerV1201 = LocalCacheManagerV12.getInstance();
        LocalCacheManagerV12 localCacheManagerV1202 = LocalCacheManagerV12.getInstance();
        localCacheManagerV1201.put("1", "北京");
        LOG.info("localCacheManagerV1201 == localCacheManagerV1202 is {}", (localCacheManagerV1201 == localCacheManagerV1202));
        LOG.info("localCacheManagerV1201.get('1')={} ", (localCacheManagerV1201.get("1")));
        LOG.info("localCacheManagerV1202.get('2')={} ", (localCacheManagerV1202.get("1")));
    }

    public void demo03() {
        LocalCacheManagerV13 localCacheManagerV1301 = LocalCacheManagerV13.getInstance();
        LocalCacheManagerV13 localCacheManagerV1302 = LocalCacheManagerV13.getInstance();
        localCacheManagerV1301.put("1", "北京");
        LOG.info("localCacheManagerV1301 == localCacheManagerV1302 is {}", (localCacheManagerV1301 == localCacheManagerV1302));
        LOG.info("localCacheManagerV1301.get('1')={} ", (localCacheManagerV1301.get("1")));
        LOG.info("localCacheManagerV1302.get('2')={} ", (localCacheManagerV1302.get("1")));
    }
}
