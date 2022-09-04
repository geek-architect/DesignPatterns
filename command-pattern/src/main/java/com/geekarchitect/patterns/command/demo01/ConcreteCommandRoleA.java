package com.geekarchitect.patterns.command.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 命令角色：ConcreteCommandRoleA
 *
 * @author 极客架构师@吴念
 * @createTime 2022/8/26
 */
public class ConcreteCommandRoleA extends AbstractCommandRole {
    private static final Logger LOG = LoggerFactory.getLogger(ConcreteCommandRoleA.class);
    private final IExecutorRole receiver;

    public ConcreteCommandRoleA(IExecutorRole receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        LOG.info("命令角色：ConcreteCommandRoleA");
        receiver.doExecute01();
    }
}
