package com.geekarchitect.patterns.command.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 命令调用者角色
 *
 * @author 极客架构师@吴念
 * @createTime 2022/8/26
 */
public class InvokerRole {
    private static final Logger LOG = LoggerFactory.getLogger(InvokerRole.class);
    private final ICommandRole command;

    public InvokerRole(ICommandRole command) {
        this.command = command;
    }

    public void action() {
        LOG.info("命令调用者角色:action()");
        this.command.execute();
    }
}
