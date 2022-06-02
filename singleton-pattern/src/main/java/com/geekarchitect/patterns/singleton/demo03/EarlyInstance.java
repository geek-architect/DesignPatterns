package com.geekarchitect.patterns.singleton.demo03;

import com.geekarchitect.patterns.singleton.demo02.LocalCacheManagerV22;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单例模式：提前实例化
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/1
 */
public class EarlyInstance {
    private static final Logger LOG = LoggerFactory.getLogger(EarlyInstance.class);
    private static final EarlyInstance EARLY_INSTANCE = new EarlyInstance();

    private EarlyInstance() {
    }

    public static EarlyInstance getInstance() {
        return EARLY_INSTANCE;
    }
    public void doService(){
       LOG.info("单例模式：提前实例化 ");
    }
}
