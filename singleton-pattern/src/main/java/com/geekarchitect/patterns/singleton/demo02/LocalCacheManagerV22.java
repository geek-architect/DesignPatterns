package com.geekarchitect.patterns.singleton.demo02;

import com.geekarchitect.patterns.singleton.demo01.ILocalCache;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/5/30
 */
public class LocalCacheManagerV22 implements ILocalCache {
    private static final Logger LOG = LoggerFactory.getLogger(LocalCacheManagerV22.class);
    private final Cache<String, String> guavaCache;
    private static final LocalCacheManagerV22 localCacheManagerV22;

    static {
        LOG.info("提前实例化：第二版代码（静态块初始化，推荐方案）");
        localCacheManagerV22 = new LocalCacheManagerV22();
    }

    private LocalCacheManagerV22() {
        LOG.info("初始化缓存");
        guavaCache = CacheBuilder.newBuilder().build();
    }

    public static LocalCacheManagerV22 getInstance() {
        return localCacheManagerV22;
    }

    @Override
    public void put(String key, String value) {
        guavaCache.put(key, value);
    }

    @Override
    public String get(String key) {
        return guavaCache.getIfPresent(key);
    }
}
