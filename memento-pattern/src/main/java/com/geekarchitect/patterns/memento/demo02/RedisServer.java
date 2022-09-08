package com.geekarchitect.patterns.memento.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 备忘录创建者角色：Memento creator role
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/6
 */
public class RedisServer {
    private static final Logger LOG = LoggerFactory.getLogger(RedisServer.class);

    private Map<String, String> valueMap = new HashMap<>();

    public RedisServer() {
    }

    public void set(String key, String value) {
        valueMap.put(key, value);
    }

    public String get(String key) {
        return valueMap.get(key);
    }

    /**
     * 创建快照
     * @return
     */
    public ISnapshot createSnapshot() {
        ISnapshot snapshot = new RedisSnapshot(this);
        LOG.info("快照创建成功");
        return snapshot;
    }

    /**
     * 恢复快照
     * @param snapshot
     */
    public void restoreSnapshot(ISnapshot snapshot) {
        RedisSnapshot redisSnapshot = (RedisSnapshot) snapshot;
        this.valueMap = (Map<String, String>) ((HashMap) ((RedisSnapshot) snapshot).getValueMap()).clone();
        LOG.info("快照恢复成功");
    }

    /**
     * 快照实现类
     */
    private static class RedisSnapshot implements ISnapshot {
        private final Map<String, String> valueMap;

        public RedisSnapshot(RedisServer redisServer) {
            this.valueMap = (Map<String, String>) ((HashMap) redisServer.valueMap).clone();
        }

        public Map<String, String> getValueMap() {
            return valueMap;
        }
    }

}
