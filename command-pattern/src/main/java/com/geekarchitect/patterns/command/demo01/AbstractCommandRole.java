package com.geekarchitect.patterns.command.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象命令
 *
 * @author 极客架构师@吴念
 * @createTime 2022/8/26
 */
public abstract class AbstractCommandRole implements ICommandRole {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractCommandRole.class);

    @Override
    public void execute() {
        LOG.info("默认execute方法");
    }
}
