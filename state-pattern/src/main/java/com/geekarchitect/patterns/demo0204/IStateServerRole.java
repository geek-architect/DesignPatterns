package com.geekarchitect.patterns.demo0204;

/**
 * 状态服务方-接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/18
 */
public interface IStateServerRole {
    /**
     * 状态控方法1
     */
    void stateServer1();

    /**
     * 状态控方法2
     */
    void stateServer2();

    /**
     * 非状态控方法
     */
    void unStateServer();

    /**
     * 改变状态
     */
    void changeState();
}
