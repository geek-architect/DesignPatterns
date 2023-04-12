package com.geekarchitect.patterns.singleton.demo05;

import com.geekarchitect.patterns.singleton.demo02.LocalCacheManagerV21;
import com.geekarchitect.patterns.singleton.demo02.LocalCacheManagerV22;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/5/30
 */
public class TestEnumLocalCacheManager {
    private static final Logger LOG = LoggerFactory.getLogger(TestEnumLocalCacheManager.class);

    public static void main(String[] args) {
        TestEnumLocalCacheManager testLocalCacheManager = new TestEnumLocalCacheManager();
        testLocalCacheManager.demo01();
    }

    public void demo01() {
        LOG.info("基于枚举的单例模式");
        EnumLocalCacheManager enumLocalCacheManager01=EnumLocalCacheManager.INSTANCE;
        EnumLocalCacheManager enumLocalCacheManager02=EnumLocalCacheManager.INSTANCE;
        enumLocalCacheManager01.put("1","北京");
        LOG.info("enumLocalCacheManager01 == enumLocalCacheManager02 is {}", (enumLocalCacheManager01 == enumLocalCacheManager02));
        LOG.info("enumLocalCacheManager01.get('1')={} ", (enumLocalCacheManager01.get("1")));
        LOG.info("enumLocalCacheManager02.get('2')={} ", (enumLocalCacheManager02.get("1")));
    }

}
