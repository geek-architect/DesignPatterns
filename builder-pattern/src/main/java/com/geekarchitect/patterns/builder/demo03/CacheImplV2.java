package com.geekarchitect.patterns.builder.demo03;

import java.util.Map;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/7/4
 */
public class CacheImplV2<K, V> implements ICache<K, V> {
    /**
     * 初始化容量,必须
     */
    private final int initialCapacity;
    /**
     * 最大数量，必须
     */
    private final long maximumSize;
    private final Map<String, String> cacheMap = null;
    /**
     * 并行等级。决定segment数量的参数
     */
    private int concurrencyLevel = -1;
    /**
     * 最大权重
     */
    private long maximumWeight = -1L;
    /**
     * 写操作后失效时间
     */
    private long expireAfterWriteNanos = -1L;
    /**
     * 访问操作后失效时间
     */
    private long expireAfterAccessNanos = -1L;

    public CacheImplV2(int initialCapacity, long maximumSize) {
        this.initialCapacity = initialCapacity;
        this.maximumSize = maximumSize;
    }

    public CacheImplV2(int initialCapacity, long maximumSize, int concurrencyLevel) {
        this.initialCapacity = initialCapacity;
        this.maximumSize = maximumSize;
        this.concurrencyLevel = concurrencyLevel;
    }

    public CacheImplV2(int initialCapacity, long maximumSize, int concurrencyLevel, long maximumWeight) {
        this.initialCapacity = initialCapacity;
        this.maximumSize = maximumSize;
        this.concurrencyLevel = concurrencyLevel;
        this.maximumWeight = maximumWeight;
    }

    public CacheImplV2(int initialCapacity, long maximumSize, int concurrencyLevel, long maximumWeight, long expireAfterWriteNanos) {
        this.initialCapacity = initialCapacity;
        this.maximumSize = maximumSize;
        this.concurrencyLevel = concurrencyLevel;
        this.maximumWeight = maximumWeight;
        this.expireAfterWriteNanos = expireAfterWriteNanos;
    }

    public CacheImplV2(int initialCapacity, long maximumSize, int concurrencyLevel, long maximumWeight, long expireAfterWriteNanos, long expireAfterAccessNanos) {
        this.initialCapacity = initialCapacity;
        this.maximumSize = maximumSize;
        this.concurrencyLevel = concurrencyLevel;
        this.maximumWeight = maximumWeight;
        this.expireAfterWriteNanos = expireAfterWriteNanos;
        this.expireAfterAccessNanos = expireAfterAccessNanos;
    }

    @Override
    public String toString() {
        return "CacheImplV1{" +
                "initialCapacity=" + initialCapacity +
                ", maximumSize=" + maximumSize +
                ", cacheMap=" + cacheMap +
                ", concurrencyLevel=" + concurrencyLevel +
                ", maximumWeight=" + maximumWeight +
                ", expireAfterWriteNanos=" + expireAfterWriteNanos +
                ", expireAfterAccessNanos=" + expireAfterAccessNanos +
                '}';
    }

    @Override
    public void put(K key, V value) {
    }

    @Override
    public V get(K key) {
        return null;
    }
}
