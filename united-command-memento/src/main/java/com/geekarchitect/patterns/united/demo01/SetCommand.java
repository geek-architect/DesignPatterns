package com.geekarchitect.patterns.united.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/10
 */
public class SetCommand extends AbstractRedisCommand {
    public SetCommand(RedisServer redisServer) {
        super(redisServer, "set");
    }

    @Override
    public void doExecute() {
        redisServer.set(key, value);
    }
}
