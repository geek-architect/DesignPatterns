package com.geekarchitect.patterns.demo0105;

/**
 * 策略服务方接口
 * @author 极客架构师@吴念
 * @createTime 2022/3/30
 */
public interface IStrategyServerRole {
    void server(IStrategyDelegateRole strategyDelegateRole);
}
