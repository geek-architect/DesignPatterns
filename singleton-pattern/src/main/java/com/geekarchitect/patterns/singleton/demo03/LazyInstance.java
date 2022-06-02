package com.geekarchitect.patterns.singleton.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单例模式：延迟实例化
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/1
 */
public class LazyInstance {
    private static final Logger LOG = LoggerFactory.getLogger(LazyInstance.class);
    private static LazyInstance LAZY_INSTANCE;

    private LazyInstance() {
    }

    public static LazyInstance getInstance() {
        if (null == LAZY_INSTANCE) {
            synchronized (LazyInstance.class) {
                if (null == LAZY_INSTANCE) {
                    LAZY_INSTANCE = new LazyInstance();
                }
            }
        }
        return LAZY_INSTANCE;
    }

    public void doService(){
        LOG.info("单例模式：延迟实例化");
    }
}
