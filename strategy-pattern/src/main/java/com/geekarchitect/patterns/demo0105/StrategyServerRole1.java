package com.geekarchitect.patterns.demo0105;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 策略服务方实现类
 * @author 极客架构师@吴念
 * @createTime 2022/3/30
 */
public class StrategyServerRole1 implements IStrategyServerRole {
    private static final Logger LOG = LoggerFactory.getLogger(StrategyServerRole1.class);
    @Override
    public void server(IStrategyDelegateRole strategyDelegateRole) {
        //策略1
        LOG.info("策略服务方：StrategyServerRole1，执行策略1");
    }
}
