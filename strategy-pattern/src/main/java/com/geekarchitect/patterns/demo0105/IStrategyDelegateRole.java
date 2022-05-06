package com.geekarchitect.patterns.demo0105;

/**
 * 策略代理方接口
 * @author 极客架构师@吴念
 * @createTime 2022/3/30
 */
public interface IStrategyDelegateRole {
    /**
     *
     * @author: 极客架构师@吴念
     * @date: 2022/4/4
     * @param: [strategyServerRole]
     * @return: void
     */
    void setStrategyDelegate(IStrategyServerRole strategyServerRole);
    /**
     *
     * @author: 极客架构师@吴念
     * @date: 2022/4/4
     * @param: []
     * @return: void
     */
    void doServer();
}
