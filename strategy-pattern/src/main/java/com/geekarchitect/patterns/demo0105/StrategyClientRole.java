package com.geekarchitect.patterns.demo0105;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 策略客户方
 * @author 极客架构师@吴念
 * @createTime 2022/3/30
 */
public class StrategyClientRole {
    private static final Logger LOG = LoggerFactory.getLogger(StrategyClientRole.class);
    /**
     * 根据业务需要选择合适的策略服务对象
     * @author: 极客架构师@吴念
     * @date: 2022/4/4
     * @param: []
     * @return: com.geekarchitect.patterns.demo105.IStrategyServerRole
     */
    public IStrategyServerRole chooseStrategyServer() {
        LOG.info("根据业务需要选择合适的策略服务对象");
        return new StrategyServerRole1();
    }
    /**
     * 客户业务方法
     * @author: 极客架构师@吴念
     * @date: 2022/4/4
     * @param: []
     * @return: void
     */
    public void clientMethod() {
        LOG.info("策略模式通用代码");
        IStrategyDelegateRole strategyDelegateRole = new StrategyDelegateRole();
        IStrategyServerRole strategyServerRole = chooseStrategyServer();
        strategyDelegateRole.setStrategyDelegate(strategyServerRole);
        strategyDelegateRole.doServer();
    }
}
