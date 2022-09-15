package com.geekarchitect.patterns.united.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/10
 */
public interface IRedisCommand {
    void execute();

    void backupMemento(IMemento beforeMemento, IMemento afterMemento);

    IMemento getBeforeMemento();

    IMemento getAfterMemento();

    void setKey(String key);

    void setValue(String value);
}
