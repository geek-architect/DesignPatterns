package com.geekarchitect.patterns.united.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/10
 */
public abstract class AbstractRedisCommand implements IRedisCommand {
    private static final Logger LOG = LoggerFactory.getLogger(RedisServer.class);
    protected final RedisServer redisServer;
    protected final String commandName;
    protected String key;
    protected String value;

    private IMemento beforeMemento;
    private IMemento afterMemento;

    public AbstractRedisCommand(RedisServer redisServer, String commandName) {
        this.redisServer = redisServer;
        this.commandName = commandName;
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    public abstract void doExecute();

    @Override
    public final void execute() {
        doExecute();
        LOG.info("执行命令{},key={},value={}", commandName, key, value);
    }

    @Override
    public void backupMemento(IMemento beforeMemento, IMemento afterMemento) {
        this.beforeMemento = beforeMemento;
        this.afterMemento = afterMemento;
    }

    @Override
    public IMemento getBeforeMemento() {
        return this.beforeMemento;
    }

    @Override
    public IMemento getAfterMemento() {
        return this.afterMemento;
    }
}
