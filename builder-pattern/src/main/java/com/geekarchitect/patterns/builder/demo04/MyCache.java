package com.geekarchitect.patterns.builder.demo04;

import java.util.Map;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/7/6
 */
public class MyCache<K, V> {
    /**
     * 初始化容量,必须
     */
    private final int initialCapacity;
    /**
     * 最大数量，必须
     */
    private final long maximumSize;
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
    private MyCache(MyCacheBuilder myCacheBuilder) {
        this.initialCapacity = myCacheBuilder.initialCapacity;
        this.maximumSize = myCacheBuilder.maximumSize;
        this.concurrencyLevel = myCacheBuilder.concurrencyLevel;
        this.maximumWeight = myCacheBuilder.maximumWeight;
        this.expireAfterWriteNanos = myCacheBuilder.expireAfterWriteNanos;
        this.expireAfterAccessNanos = myCacheBuilder.expireAfterAccessNanos;
    }

    @Override
    public String toString() {
        return "MyCache{" +
                "initialCapacity=" + initialCapacity +
                ", maximumSize=" + maximumSize +
                ", concurrencyLevel=" + concurrencyLevel +
                ", maximumWeight=" + maximumWeight +
                ", expireAfterWriteNanos=" + expireAfterWriteNanos +
                ", expireAfterAccessNanos=" + expireAfterAccessNanos +
                '}';
    }

    public void put(K key, V value) {
    }

    public V get(K key) {
        return null;
    }

    public static class MyCacheBuilder<K, V> {
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

        public MyCacheBuilder(int initialCapacity, long maximumSize) {
            this.initialCapacity = initialCapacity;
            this.maximumSize = maximumSize;
        }

        public MyCacheBuilder setConcurrencyLevel(int concurrencyLevel) {
            this.concurrencyLevel = concurrencyLevel;
            return this;
        }

        public MyCacheBuilder setMaximumWeight(long maximumWeight) {
            this.maximumWeight = maximumWeight;
            return this;
        }

        public MyCacheBuilder setExpireAfterWriteNanos(long expireAfterWriteNanos) {
            this.expireAfterWriteNanos = expireAfterWriteNanos;
            return this;
        }

        public MyCacheBuilder setExpireAfterAccessNanos(long expireAfterAccessNanos) {
            this.expireAfterAccessNanos = expireAfterAccessNanos;
            return this;
        }

        public MyCache build() {
            return new MyCache<K, V>(this);
        }
    }
}
