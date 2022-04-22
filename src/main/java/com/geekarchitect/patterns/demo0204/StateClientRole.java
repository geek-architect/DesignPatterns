package com.geekarchitect.patterns.demo0204;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 状态客户方
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class StateClientRole {
    private static final Logger LOG = LoggerFactory.getLogger(StateClientRole.class);

    public void clientMethod() {
        LOG.info("状态模式通用代码");
        IStateServerRole stateServerRole = new StateServerRole();
        stateServerRole.stateServer1();
    }
}
