package com.geekarchitect.patterns.builder.demo03;

/**
 * Cache接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/7/4
 */
public interface ICache<K, V> {
    void put(K key, V value);

    V get(K key);
}
