package com.geekarchitect.patterns.command.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 命令执行者具体类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/8/26
 */
public class ConcreteExecutorRole extends AbstractExecutorRole {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteExecutorRole.class);

    @Override
    public void doExecute01() {
        LOG.info("命令执行者具体类  doExecute01");
    }

    @Override
    public void doExecute02() {
        LOG.info("命令执行者具体类  doExecute02");
    }

}
