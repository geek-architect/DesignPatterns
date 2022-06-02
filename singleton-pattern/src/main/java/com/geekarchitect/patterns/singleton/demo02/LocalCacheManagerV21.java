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
public class LocalCacheManagerV21 implements ILocalCache {
    private static final Logger LOG = LoggerFactory.getLogger(LocalCacheManagerV21.class);
    private static final LocalCacheManagerV21 LOCAL_CACHE_MANAGER_V_21 = new LocalCacheManagerV21();
    private final Cache<String, String> guavaCache;

    private LocalCacheManagerV21() {
        LOG.info("提前实例化：第一版代码（属性初始化）");
        LOG.info("初始化缓存");
        guavaCache = CacheBuilder.newBuilder().build();
    }

    public static LocalCacheManagerV21 getInstance() {
        return LOCAL_CACHE_MANAGER_V_21;
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
