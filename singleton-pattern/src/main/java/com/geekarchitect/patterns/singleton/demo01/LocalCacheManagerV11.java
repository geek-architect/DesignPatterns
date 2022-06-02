package com.geekarchitect.patterns.singleton.demo01;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 本地缓存管理器
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/30
 */
public class LocalCacheManagerV11 implements ILocalCache {
    private static final Logger LOG = LoggerFactory.getLogger(LocalCacheManagerV11.class);
    private static Cache<String, String> guavaCache = null;
    private static LocalCacheManagerV11 localCacheManagerV11 = null;

    private LocalCacheManagerV11() {
        initCache();
    }

   /* public static LocalCacheManagerV11 getInstance() {
        if (null == localCacheManagerV11) {
            LOG.info("延迟实例化：第一版代码（非线程安全）");
            localCacheManagerV11 = new LocalCacheManagerV11();
        }
        return localCacheManagerV11;
    }*/


    /*public static synchronized LocalCacheManagerV11 getInstance() {
        if (null == localCacheManagerV11) {
            LOG.info("延迟实例化：第一版代码优化（线程安全，低效）");
            localCacheManagerV11 = new LocalCacheManagerV11();
        }
        return localCacheManagerV11;
    }*/


    public static LocalCacheManagerV11 getInstance() {
        if (null == localCacheManagerV11) {
            synchronized (LocalCacheManagerV11.class) {
                LOG.info("延迟实例化：第一版代码再优化（线程安全，双重检测，高效，推荐方案）");
                if (null == localCacheManagerV11) {
                    localCacheManagerV11 = new LocalCacheManagerV11();
                }
            }
        }
        return localCacheManagerV11;
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
