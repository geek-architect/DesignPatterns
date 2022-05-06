package com.geekarchitect.patterns.demo0105;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/3/30
 */
public class StrategyDelegateRole implements IStrategyDelegateRole {
    private static final Logger LOG = LoggerFactory.getLogger(StrategyDelegateRole.class);
    private IStrategyServerRole strategyProviderRole;

    @Override
    public void setStrategyDelegate(IStrategyServerRole strategyProviderRole) {
        this.strategyProviderRole = strategyProviderRole;
    }

    @Override
    public void doServer() {
        LOG.info("策略代理方：StrategyDelegateRole，调用策略服务对象，执行策略");
        strategyProviderRole.server(this);
    }
}
