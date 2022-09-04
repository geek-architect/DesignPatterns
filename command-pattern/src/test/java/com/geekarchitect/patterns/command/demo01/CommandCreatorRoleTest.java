package com.geekarchitect.patterns.command.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CommandCreatorRoleTest {
    private static final Logger LOG = LoggerFactory.getLogger(CommandCreatorRoleTest.class);
    private CommandCreatorRole commandCreatorRole;

    @BeforeEach
    void setUp() {
        commandCreatorRole = new CommandCreatorRole();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void service() {
        LOG.info("命令模式通用代码");
        commandCreatorRole.service();
    }
}