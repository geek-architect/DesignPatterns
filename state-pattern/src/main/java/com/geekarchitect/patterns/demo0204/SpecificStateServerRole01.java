package com.geekarchitect.patterns.demo0204;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 特定状态服务方实现类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public class SpecificStateServerRole01 extends AbstractSpecificStateServerRole {
    private static final Logger LOG = LoggerFactory.getLogger(SpecificStateServerRole01.class);

    public SpecificStateServerRole01(IStateServerRole stateServerRole) {
        super(stateServerRole);
    }

    @Override
    public void stateServer1() {
        LOG.info("特定状态服务方:SpecificStateServerRole01,执行stateServer1方法");
    }

}
