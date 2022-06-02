package com.geekarchitect.patterns.singleton.demo01;

/**
 * 本地缓存接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/30
 */
public interface ILocalCache {
    void put(String key, String value);

    String get(String key);
}
