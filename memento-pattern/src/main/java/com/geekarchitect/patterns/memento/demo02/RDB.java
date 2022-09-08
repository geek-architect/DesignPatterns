package com.geekarchitect.patterns.memento.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RDB
 * 备忘录管理者角色：Memento manager role
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/6
 */
public class RDB {
    private static final Logger LOG = LoggerFactory.getLogger(RDB.class);
    private final RedisServer redisServer;
    private ISnapshot snapshot;

    public RDB(RedisServer redisServer) {
        this.redisServer = redisServer;
    }

    /**
     * 恢复
     *
     * @author: 极客架构师@吴念
     * @date: 2022/9/7
     * @param: []
     * @return: void
     */
    public void restore() {
        if (this.snapshot != null) {
            redisServer.restoreSnapshot(this.snapshot);
            LOG.info("恢复成功");
        } else {
            LOG.info("恢复失败，尚无快照");
        }
    }

    /**
     * 备份
     *
     * @author: 极客架构师@吴念
     * @date: 2022/9/7
     * @param:
     * @return:
     */
    public void backup() {
        this.snapshot = redisServer.createSnapshot();
        LOG.info("备份成功");
    }
}
