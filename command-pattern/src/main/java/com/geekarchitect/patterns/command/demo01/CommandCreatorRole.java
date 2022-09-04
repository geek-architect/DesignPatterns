package com.geekarchitect.patterns.command.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 命令创建者
 *
 * @author 极客架构师@吴念
 * @createTime 2022/8/26
 */
public class CommandCreatorRole {
    private static final Logger LOG = LoggerFactory.getLogger(CommandCreatorRole.class);

    public void service() {
        LOG.info("命令创建者角色：service");
        IExecutorRole executorRole = new ConcreteExecutorRole();
        ICommandRole commandRoleA = new ConcreteCommandRoleA(executorRole);
        InvokerRole invokerRole = new InvokerRole(commandRoleA);
        invokerRole.action();
    }
}
