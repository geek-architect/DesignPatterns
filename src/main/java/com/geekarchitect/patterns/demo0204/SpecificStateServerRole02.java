package com.geekarchitect.patterns.demo0204;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class SpecificStateServerRole02 extends AbstractSpecificStateServerRole {
    private static final Logger LOG = LoggerFactory.getLogger(SpecificStateServerRole02.class);

    public SpecificStateServerRole02(IStateServerRole stateServerRole) {
        super(stateServerRole);
    }

    @Override
    public void stateServer1() {
        LOG.info("特定状态服务方:SpecificStateServerRole02,执行stateServer1方法");
    }

    @Override
    public void stateServer2() {
        LOG.info("特定状态服务方:SpecificStateServerRole02,执行stateServer2方法");
    }
}
