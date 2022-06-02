package com.geekarchitect.patterns.singleton.demo01;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/30
 */
public class LocalCacheManagerV12 implements ILocalCache {
    private static final Logger LOG = LoggerFactory.getLogger(LocalCacheManagerV12.class);
    private static Cache<String, String> guavaCache = null;
    private static LocalCacheManagerV12 localCacheManagerV01 = null;
    private static final Lock reentrantLock = new ReentrantLock();

    private LocalCacheManagerV12() {
        initCache();
    }

    public static LocalCacheManagerV12 getInstance() {
        if (null == localCacheManagerV01) {
            reentrantLock.lock();
            LOG.info("第二版代码（线程安全，双重检测,可重入锁，高效）");
            try {
                if (null == localCacheManagerV01) {
                    localCacheManagerV01 = new LocalCacheManagerV12();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return localCacheManagerV01;
    }

    private void initCache() {
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
}
