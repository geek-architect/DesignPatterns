package com.geekarchitect.patterns.singleton.demo05;

import com.geekarchitect.patterns.singleton.demo01.ILocalCache;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 基于枚举的单例模式
 * @author 极客架构师@吴念
 * @createTime 2022/5/30
 */
public enum EnumLocalCacheManager implements ILocalCache {
    INSTANCE;
    private Cache<String, String> guavaCache;
    EnumLocalCacheManager() {
        guavaCache = CacheBuilder.newBuilder().build();
    }

    public static EnumLocalCacheManager getInstance() {
        return INSTANCE;
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
