package com.geekarchitect.patterns.united.demo01;

/**
 * 删除key
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/10
 */
public class DelCommand extends AbstractRedisCommand {
    public DelCommand(RedisServer redisServer) {
        super(redisServer, "del");
    }

    @Override
    public void doExecute() {
        redisServer.del(key);
    }
}
