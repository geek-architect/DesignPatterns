package com.geekarchitect.patterns.singleton.demo01;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/5/30
 */
public class LocalCacheManagerV13 implements ILocalCache {
    private static final Logger LOG = LoggerFactory.getLogger(LocalCacheManagerV13.class);
    private static Cache<String, String> guavaCache = null;

    private LocalCacheManagerV13() {
        initCache();
    }

    public static LocalCacheManagerV13 getInstance() {
        return LocalCacheManagerHolder.localCacheManagerV13;
    }

    private void initCache() {
        LOG.info("第三版代码（线程安全，静态内部类）");
        LOG.info("初始化缓存");
        guavaCache = CacheBuilder.newBuilder().build();
    }

    @Override
    public void put(String key, String value) {
        guavaCache.put(key, value);
    }

    @Override
    public String get(String key) {
        return guavaCache.getIfPresent(key);
    }

    public static class LocalCacheManagerHolder {
        private static final LocalCacheManagerV13 localCacheManagerV13 = new LocalCacheManagerV13();
    }
}
