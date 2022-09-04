package com.geekarchitect.patterns.command.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 命令执行者抽象类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/8/26
 */
public abstract class AbstractExecutorRole implements IExecutorRole {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractExecutorRole.class);

    @Override
    public void doExecute01() {
        LOG.info("默认doExecute01");
    }

    @Override
    public void doExecute02() {
        LOG.info("默认doExecute02");
    }
}
